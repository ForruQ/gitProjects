<jsp:include page="/WEB-INF/jsp/home/header.jsp" />

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="/resources/css/cart.css">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<jsp:include page="/WEB-INF/jsp/home/navbar.jsp" />

<div id="all">
    <div id="content">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <!-- breadcrumb-->
                    <nav aria-label="breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="#">Home</a></li>
                            <li aria-current="page" class="breadcrumb-item active">Shopping cart</li>
                        </ol>
                    </nav>
                </div>
                <div id="basket" class="col-lg-9">
                    <div class="box">
                        <form method="post" action="/temporaryTable/save">
                            <h1>Shopping cart</h1>
                            <p class="text-muted">You currently have ${map.count} item(s) in your cart.</p>
                            <div class="table-responsive">
                                    <thead>
                                <table class="table" id="basket">
                                        <tr>
                                            <th colspan="2">Product</th>
                                            <th>Quantity</th>
                                            <th>Unit price</th>
                                            <th>Discount</th>
                                            <th colspan="2">Total</th>
                                            <th>Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="p" items="${map.bList}">                                        
                                            <tr class="MyClass">
                                                <td><a href="#"><img height="40px" width="30px" src="/resources/product/img/${p.pPhoto}" alt="White Blouse Armani"></a></td>
                                                <td><a href="#">${p.pName}</a></td>
                                                <td>
                                                    <input id="qty" name="qty[]" type="number" value="1" class="p-qty form-control" onchange="change(this)">
                                                </td>
                                                <td >${p.pPrice}</td>
                                                <td>${p.discount}</td>
                                                <td>

                                                    <input type="text" class="in-total" id="inTotal" value="${p.total}" disabled="disabled"/>
                                                </td>

                                                <td><a href="/basket/delete/${p.id}"><i class="fa fa-trash-o"></i></a>
                                                </td>

                                                <!--This  is button-->


                                                <td>
                                                    <input type="hidden" name="ids[]" value="${p.id}"/>
                                                    <input type="hidden" name="pId[]" value="${p.pId}"/>
                                                    <input type="hidden" name="pName[]" value="${p.pName}"/>
                                                    <input type="hidden" name="pCode[]" value="${p.pCode}"/>
                                                    <input type="hidden" name="pPhoto[]" value="${p.pPhoto}"/>
                                                    <input type="hidden" name="pPrice[]" class="p-price" value="${p.pPrice}"/>
                                                     <input type="hidden" name="discount[]" class="p-discount" value="${p.discount}"/>
                                                    <input type="hidden" name="total[]" id="total" class="p-total" value="${p.total}"/>
                                                   
                                                     <input type="hidden" name="cId[]" id="" value="${p.cId}"/>
                                                     <input type="hidden" name="cId" id="" value="${p.cId}"/>
                                                </td>


                                            </tr>
                                           
                                        </c:forEach>
                                    </tbody>
                                    <tfoot>
                                        <tr>
                                            <th colspan="5">Subtotal</th>
                                            <th colspan="2">

                                                <label class="lblTotal" id="lblTotal">
                                                    0
                                                </label>
                                            </th>
                                        </tr>

                                    </tfoot>
                                </table>
                            </div>
                            <input type="hidden" class="sub-total"/>
                            <input type="hidden" value="5"/>
                            <input type="hidden" class="grand-total"/>
                            <!-- /.table-responsive-->
                            <div class="box-footer d-flex justify-content-between flex-column flex-lg-row">
                                <div class="left"><a href="/home/shop" class="btn btn-outline-secondary"><i class="fa fa-chevron-left"></i> Continue shopping</a></div>
                                <div class="right">
                                    <a href="/home/checkout1" > <button type="submit" class="btn btn-primary">Proceed to checkout <i class="fa fa-chevron-right"></i></button></a>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <!-- /.col-lg-9-->
                <div class="col-lg-3">
                    <div id="order-summary" class="box">
                        <div class="box-header">
                            <h3 class="mb-0">Order summary</h3>
                        </div>
                        <p class="text-muted">Shipping and additional costs are calculated based on the values you have entered.</p>
                        <div class="table-responsive">
                            <table class="table">
                                <tbody>
                                    <tr>
                                        <td>Order subtotal</td>
                                        <th id="sub"></th>
                                    </tr>
                                    <!--                                    <tr>
                                                                            <td>Shipping and handling</td>
                                                                            <th>100</th>
                                                                        </tr>-->
                                    <tr>
                                        <td>Tax</td>
                                        <th id="tax">5</th>
                                    </tr>
                                    <tr class="total">
                                        <td>Total</td>
                                        <th id="grandTotal">500</th>
                               
                                     
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    
                </div>
                <!-- /.col-md-3-->
            </div>
        </div>
    </div>
</div>
<jsp:include page="/WEB-INF/jsp/home/footer1.jsp" />
<script>


    

    function change(el) {
        var pName = $(el).closest("tr").find(".p-name").val();
        var pPrice = $(el).closest("tr").find(".p-price").val();
        var pQty = $(el).closest("tr").find(".p-qty").val();
        var pDiscount = $(el).closest("tr").find(".p-discount").val();
        var total = parseInt(pPrice) * parseInt(pQty);
        var pTotal = (total - ((parseInt(pDiscount) * total) / 100));
        $(el).closest("tr").find(".p-total").val(pTotal);
        $(el).closest("tr").find(".in-total").val(pTotal);
        calcTotal();
        
        //After working
       var lblTotal = $("#lblTotal").text();
      $("#sub").text(lblTotal);
       var vat =parseFloat(lblTotal) * 0.05;
       var grandToatal = parseInt(lblTotal) + vat;
      console.log(grandToatal);
     $("#grandTotal").text(grandToatal);
     $(".grand-total").val(grandToatal);
    $(".sub-total").val(lblTotal);
        
        

    }
   

    var sum = 0;
    function calcTotal() {
        sum=0;
        $('#basket tbody tr').each(function () {
            $(this).find('.p-total').each(function () {
                var combat = parseInt($(this).val());
                calc(combat);
            });
            $("#lblTotal").text(sum);
            //After working
       var lblTotal = $("#lblTotal").text();
      $("#sub").text(lblTotal);
       var vat =parseFloat(lblTotal) * 0.15;
       var grandToatal = parseInt(lblTotal) + vat;
      console.log(grandToatal);
     $("#grandTotal").text(grandToatal);
     $(".grand-total").val(grandToatal);
     $(".sub-total").val(lblTotal);
        
        });

    }
    function calc(a) {
        sum += a;
        console.log(sum)
    }

 calcTotal();

</script>
