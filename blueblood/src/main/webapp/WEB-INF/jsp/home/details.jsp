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
                            <li class="breadcrumb-item"><a href="#">Ladies</a></li>
                            <li class="breadcrumb-item"><a href="#">Tops</a></li>
                            <li aria-current="page" class="breadcrumb-item active">White Blouse Armani</li>
                        </ol>
                    </nav>
                </div>
                <div class="col-lg-3 order-2 order-lg-1">

                    <div class="card sidebar-menu mb-4">
                        <div class="card-header">
                            <h3 class="h4 card-title">Categories</h3>
                        </div>
                        <div class="card-body">
                            <ul class="nav nav-pills flex-column category-menu">
                                <li><a href="/home/men" class="nav-link">Men <span class="badge badge-secondary">${map.menCount}</span></a>
                                <li><a href="/home/women" class="nav-link">Women <span class="badge badge-secondary">${map.womenCount}</span></a>
                                <li><a href="/home/babies" class="nav-link">Babies & Mom <span class="badge badge-secondary">${map.babiesCount}</span></a>

                            </ul>
                        </div>
                    </div>


                    <!-- *** MENUS AND FILTERS END ***-->
                </div>
                <div class="col-lg-9 order-1 order-lg-2">
                    <div id="productMain" class="row">
                        <div class="col-md-6">
                            <div data-slider-id="1" class="owl-carousel shop-detail-carousel">
                                <div class="item"> <img src="/resources/product/img/${map.product.pPhoto}" alt="" class="img-fluid"></div>
                            </div>
                            <div class="ribbon sale">
                                <div class="theribbon">SALE</div>
                                <div class="ribbon-background"></div>
                            </div>
                            <!-- /.ribbon-->
                            <div class="ribbon new">
                                <div class="theribbon">NEW</div>
                                <div class="ribbon-background"></div>
                            </div>
                            <!-- /.ribbon-->
                        </div>
                        <div class="col-md-6">
                            <div class="box">
                                <h1 class="text-center">${map.product.pName}</h1>
                                <h3 class="pt-3"><b>Product Description :</b>  ${map.product.pDesc}</h3>
                                <h3><b>Category :</b>  ${map.product.cName}</h3>
                                <h3><b>Discount :</b>  ${map.product.discount} %</h3>

                                <p class="price"> Price : ${map.product.pPrice}</p>

                                <form action="/basket/save" method="POST" >
                                    <input type="hidden" name="pId" value="${map.product.pId}"/>
                                    <input type="hidden" name="pName" value="${map.product.pName}"/>
                                    <input type="hidden" name="pCode" value="${map.product.pCode}"/>
                                    <input type="hidden" name="pPrice" value="${map.product.pPrice}"/> 
                                    <input type="hidden" name="discount" value="${map.product.discount}"/> 
                                    <input type="hidden" name="pPhoto" value="${map.product.pPhoto}"/>
                                    <!--                                            <input type="submit" value="Add to Cart"/>-->
                                    <p class="buttons"><a href="#" class="btn btn-outline-secondary">Add to WishList</a><input type="submit" class="btn btn-info fa fa-shopping-cart" value="Add to Cart"/>

                                </form>
                                <!--<p class="text-center buttons"><a href="/home/basket" class="btn btn-primary"><i class="fa fa-shopping-cart"></i> Add to cart</a><a href="/home/basket" class="btn btn-outline-primary"><i class="fa fa-heart"></i> Add to wishlist</a></p>-->
                            </div>

                        </div>
                    </div>

                </div>
                <!-- /.col-md-9-->
            </div>
        </div>
    </div>
</div>
<jsp:include page="/WEB-INF/jsp/home/footer1.jsp" />
<jsp:include page="/WEB-INF/jsp/home/footer.jsp" />