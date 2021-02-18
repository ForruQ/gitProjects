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
                            <li aria-current="page" class="breadcrumb-item active"></li>
                        </ol>
                    </nav>
                </div>
                <div class="col-lg-3">
                    <!--
                    *** MENUS AND FILTERS ***
                    _________________________________________________________
                    -->
                    <div class="card sidebar-menu mb-4">
                        <div class="card-header">
                            <h3 class="h4 card-title">Categories</h3>
                        </div>
                        <div class="card-body">
                            <ul class="nav nav-pills flex-column category-menu">
                                <li><a href="/home/men" class="nav-link">Men <span class="badge badge-secondary">${map.menCount}</span></a>
                                <li><a href="/home/women" class="nav-link">Women <span class="badge badge-secondary">${map.womenCount}</span></a>
                                <li><a href="/home/babies" class="nav-link">Babies & Mom <span class="badge badge-secondary">${map.babiesCount}</span></a>
                                    
                                </li> 
                            </ul>
                        </div>
                    </div>


                    <!-- *** MENUS AND FILTERS END ***-->
                </div>
                <div class="col-lg-9">

                    <div class="row products">
                        <c:forEach var="p" items="${map.pList}">
                            <div class="col-4">
                                <div class="product">

                                    <div class="flip-container">
                                        <div class="flipper">
                                            <div class="front"><a href="/product/details/${p.pId}"><img src="/resources/product/img/${p.pPhoto}" alt="" class="img-fluid"></a></div>
                                            <div class="back"><a href="/product/details/${p.pId}"><img src="/resources/product/img/${p.pPhoto}" alt="" class="img-fluid"></a></div>
                                        </div>
                                    </div><a href="/product/details/${p.pId}" class="invisible"><img src="/resources/product/img/${p.pPhoto}" alt="" class="img-fluid"></a>
                                    <div class="text">
                                        <h3><a href="/product/details/${p.pId}">${p.pName}</a></h3>
                                        <p class="price"> 
                                            Price :   <del></del> ${p.pPrice} Taka
                                        </p>
                                        <p class="price"> 
                                            Discount :   <del></del> ${p.discount} %
                                        </p>
                                        <div class="row">
                                            <div class="col-6">
                                            <form action="/wishlist/save" method="POST" >
                                            <input type="hidden" name="pId" value="${p.pId}"/>
                                            <input type="hidden" name="pName" value="${p.pName}"/>
                                            <input type="hidden" name="pCode" value="${p.pCode}"/>
                                            <input type="hidden" name="pPrice" value="${p.pPrice}"/> 
                                            <input type="hidden" name="discount" value="${p.discount}"/> 
                                            <input type="hidden" name="pPhoto" value="${p.pPhoto}"/>
                                            <!--                                            <input type="submit" value="Add to Cart"/>-->
                                          <input type="submit" class="btn btn-info fa fa-shopping-cart" value="Add to wishlist"/>
                                        </form>
                                        </div>
                                            <div class="col-6">
                                            <form action="/basket/save" method="POST" >
                                            <input type="hidden" name="pId" value="${p.pId}"/>
                                            <input type="hidden" name="pName" value="${p.pName}"/>
                                            <input type="hidden" name="pCode" value="${p.pCode}"/>
                                            <input type="hidden" name="pPrice" value="${p.pPrice}"/> 
                                            <input type="hidden" name="discount" value="${p.discount}"/> 
                                            <input type="hidden" name="pPhoto" value="${p.pPhoto}"/>
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
                        
                    </div>
                    <div class="pages">
                        <p class="loadMore"><a href="#" class="btn btn-primary btn-lg"><i class="fa fa-chevron-down"></i> Load more</a></p>
                        <nav aria-label="Page navigation example" class="d-flex justify-content-center">
                            <ul class="pagination">
                                <li class="page-item"><a href="#" aria-label="Previous" class="page-link"><span aria-hidden="true">«</span><span class="sr-only">Previous</span></a></li>
                                <li class="page-item active"><a href="#" class="page-link">1</a></li>
                                <li class="page-item"><a href="#" class="page-link">2</a></li>
                                <li class="page-item"><a href="#" class="page-link">3</a></li>
                                <li class="page-item"><a href="#" class="page-link">4</a></li>
                                <li class="page-item"><a href="#" class="page-link">5</a></li>
                                <li class="page-item"><a href="#" aria-label="Next" class="page-link"><span aria-hidden="true">»</span><span class="sr-only">Next</span></a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
                <!-- /.col-lg-9-->
            </div>
        </div>
    </div>
</div>
<jsp:include page="/WEB-INF/jsp/home/footer1.jsp" />
<jsp:include page="/WEB-INF/jsp/home/footer.jsp" />