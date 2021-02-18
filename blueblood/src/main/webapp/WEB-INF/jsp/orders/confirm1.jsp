<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/home/header.jsp" />
<jsp:include page="/WEB-INF/jsp/home/navbar.jsp" />
<div id="all">
    <div id="content">
        <div class="container">
            <div class="row">
               
                <div id="checkout" class="col-lg-9">
                    <div class="box">
                        <form method="post" action="/orders/delivered">
                            <div class="row">
                                
                                <div class="col-md-6">
                                    <h1>Order Confirmation</h1>
                                </div>
                                <div class="col-md-6">
                                    <h2>Order No: ${invoice.orderNo}</h2>
                                </div>
                            </div>
                            
                            <div class="content">
                                <div class="table-responsive">
                                    <table class="table" id="basket">
                                        <thead>
                                            <tr>
                                                <th colspan="2">Product</th>
                                                <th>Quantity</th>
                                                <th>Unit price</th>
                                                <th>Discount</th>
                                                <th>Total</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="t" items="${oList}">
                                                <tr class="MyClass">
                                                    <td><a href="#"><img src="/resources/product/img/${t.pPhoto}" alt="White Blouse Armani"></a></td>
                                                    <td><a href="#">${t.pName}</a></td>
                                                    <td>${t.qty}</td>
                                                    <td>${t.pPrice}</td>
                                                    <td>${t.discount}</td>
                                                    <td>${t.total}</td>
                                                    <td>
                                                        <input type="hidden" name="ids[]" value="${t.oId}"/>
                                                    <input type="hidden" name="pId[]" value="${t.pId}"/>
                                                    <input type="hidden" name="pName[]" value="${t.pName}"/>
                                                    <input type="hidden" name="pCode[]" value="${t.pCode}"/>
                                                    <input type="hidden" name="pCode" value="${t.pCode}"/>
                                                    <input type="hidden" name="pPhoto[]" value="${t.pPhoto}"/>
                                                    <input type="hidden" name="pPrice[]" class="p-price" value="${t.pPrice}"/>
                                                     <input type="hidden" name="discount[]" class="p-discount" value="${t.discount}"/>
                                                    <input type="hidden" name="total[]" id="total" class="p-total" value="${t.total}"/>
                                                    <input type="hidden" name="qty[]" id="" value="${t.qty}"/>
                                                     <input type="hidden" name="cId[]" id="" value="${t.cId}"/>
                                                     <input type="hidden" name="cId" id="" value="${t.cId}"/>
                                                     <input type="hidden" name="orderNo[]" id="" value="${t.orderNo}"/>
                                                </td>
                                                </tr>
                                        
                                        </c:forEach>
                                        </tbody>
                                        <tfoot>
                                            <tr>
                                                <th colspan="5">Total</th>
                                                <th class="lblTotal" id="lblTotal">${invoice.subTotal}</th>
                                            </tr>
                                        <input type="hidden" name="subTotal" value="${invoice.subTotal}"/>
                                        <input type="hidden" name="vat" value="${invoice.vat}"/>
                                        <input type="hidden" name="dCharge" value="${invoice.dCharge}"/>
                                        <input type="hidden" name="grandTotal" value="${invoice.grandTotal}"/>      
                                        <input type="hidden" name="cid" value="${invoice.cid}"/>      
                                        <input type="hidden" name="orderNo" value="${invoice.orderNo}"/>
                                        <input type="hidden" name="orderDate" value="${invoice.orderDate}"/>
                                       </tfoot>
                                       
                                    </table>
                                </div>
                                <!-- /.table-responsive-->
                            </div>
                            <!-- /.content-->
                            <div class="box-footer d-flex justify-content-between"><a href="/orders/details" class="btn btn-outline-secondary"><i class="fa fa-chevron-left"></i></a>
                                <button type="submit" class="btn btn-primary">Confirm</i></button>

                            </div>
                        </form>
                    </div>
                    <!-- /.box-->
                </div>
                <!-- /.col-lg-9-->
                <div class="col-lg-3">
                    <div id="order-summary" class="card">
                        <div class="card-header">
                            <h3 class="mt-4 mb-4">Order summary</h3>
                        </div>
                        <div class="card-body">
                            <p class="text-muted">Shipping and additional costs are calculated based on the values you have entered.</p>
                            <div class="table-responsive">
                                <table class="table">
                                    <tbody>
                                        <tr>
                                            <td>Order subtotal</td>
                                            <th class="sub-total">${invoice.subTotal}</th>
                                        </tr>
                                        <tr>
                                            <td>Vat</td>
                                            <th>${invoice.vat}</th>
                                        </tr>
                                        <tr>
                                            <td>Delivery charge</td>
                                            <th>${invoice.dCharge}</th>
                                        </tr>
                                        <tr>
                                            <td>Total</td>
                                            <th class="grand-total">${invoice.grandTotal}</th>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /.col-lg-3-->
            </div>
        </div>
    </div>
</div>
<jsp:include page="/WEB-INF/jsp/home/footer1.jsp" />



<jsp:include page="/WEB-INF/jsp/home/footer.jsp" />

