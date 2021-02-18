<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/home/header.jsp" />
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
                            <li aria-current="page" class="breadcrumb-item active">My wishlist</li>
                        </ol>
                    </nav>
                </div>
                <div class="col-lg-3">
                    <!--
                    *** CUSTOMER MENU ***
                    _________________________________________________________
                    -->
                    <div class="card sidebar-menu">
                        <div class="card-header">
                            <h3 class="h4 card-title">Customer section</h3>
                        </div>
                        <div class="card-body">
                            <ul class="nav nav-pills flex-column"><a href="customer-orders.html" class="nav-link active"><i class="fa fa-list"></i> My orders</a><a href="customer-wishlist.html" class="nav-link"><i class="fa fa-heart"></i> My wishlist</a><a href="customer-account.html" class="nav-link"><i class="fa fa-user"></i> My account</a><a href="index.html" class="nav-link"><i class="fa fa-sign-out"></i> Logout</a></ul>
                        </div>
                    </div>
                    <!-- /.col-lg-3-->
                    <!-- *** CUSTOMER MENU END ***-->
                </div>
                <div id="wishlist" class="col-lg-9">
                    <ul class="breadcrumb">
                        <li><a href="#">Home</a></li>

                    </ul>
                    <div class="box">
                        <h1>My wishlist</h1>
                    </div>
                    <div class="row products">
                        <c:forEach var="w" items="${map.pList}">
                            <div class="col-4">
                                <div class="product">
                                    <div class="flip-container">
                                        <div class="flipper">
                                            <div class="front"><a href="/product/details/${w.pId}"><img src="/resources/product/img/${w.pPhoto}" alt="" class="img-fluid"></a></div>
                                            <div class="back"><a href="/product/details/${w.pId}"><img src="/resources/product/img/${w.pPhoto}" alt="" class="img-fluid"></a></div>
                                        </div>
                                    </div><a href="/product/details/${w.pId}" class="invisible"><img src="/resources/product/img/${w.pPhoto}" alt="" class="img-fluid"></a>
                                    <div class="text">
                                        <h3><a href="/product/details/${w.pId}">${w.pName}</a></h3>
                                        <p class="price"> 
                                        <h4 class="text-center">Price : ${w.pPrice} Taka</h4>
                                        <h4 class="text-center">Discount : ${w.discount} %</h4>
                                        </p>
                                        <div class="row">
                                            <div class="col-6">
                                                <a href="/wishlist/delete/${w.id}"><button class="btn btn-warning">Remove</button></a> 
                                            </div>
                                            <div class="col-6">
                                                <form action="/basket/saveForWishList" method="POST" >
                                                    <input type="hidden" name="pId" value="${w.pId}"/>
                                                    <input type="hidden" name="pName" value="${w.pName}"/>
                                                    <input type="hidden" name="pCode" value="${w.pCode}"/>
                                                    <input type="hidden" name="pPrice" value="${w.pPrice}"/> 
                                                    <input type="hidden" name="discount" value="${w.discount}"/> 
                                                    <input type="hidden" name="pPhoto" value="${w.pPhoto}"/>
                                                    <!--                                            <input type="submit" value="Add to Cart"/>-->
                                                    <input type="submit" class="btn btn-info fa fa-shopping-cart" value="Add to Cart"/>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- /.text-->
                                </div>
                                <!-- /.product            -->
                            </div>
                        </c:forEach>
                        <!-- /.products-->
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/WEB-INF/jsp/home/footer1.jsp" />
<jsp:include page="/WEB-INF/jsp/home/footer.jsp" />