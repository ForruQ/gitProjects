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
                            <li aria-current="page" class="breadcrumb-item active">Checkout - Address</li>
                        </ol>
                    </nav>
                </div>
                <div id="checkout" class="col-lg-12">
                    <div class="box">
                        <form method="post" action="/address/save">
                            <h1>Checkout - Address</h1>
                            <div class="nav flex-column flex-md-row nav-pills text-center"><a href="checkout1.html" class="nav-link flex-sm-fill text-sm-center active"> <i class="fa fa-map-marker">                  </i>Address</a><a href="#" class="nav-link flex-sm-fill text-sm-center disabled"> <i class="fa fa-truck">                       </i>Delivery Method</a><a href="#" class="nav-link flex-sm-fill text-sm-center disabled"> <i class="fa fa-money">                      </i>Payment Method</a><a href="#" class="nav-link flex-sm-fill text-sm-center disabled"> <i class="fa fa-eye">                     </i>Order Review</a></div>
                            <div class="content py-3">
                                <div class="row">
                                    <c:forEach var="t" items="${map.tList}">
                                            <input value="${t.cId}" id="cId" name="cId" type="hidden" class="form-control">
                                            </c:forEach>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="fName">Firstname</label>
                                            <input id="fName" name="fName" type="text" class="form-control">
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="lName">Lastname</label>
                                            <input id="lName" name="lName" type="text" class="form-control">
                                        </div>
                                    </div>
                                </div>
         
                                <!-- /.row-->
                                <div class="row">
                                    <div class="col-md-6 col-lg-3">
                                        <div class="form-group">
                                            <label for="street">Street</label>
                                            <input id="street" name="street" type="text" class="form-control">
                                        </div>
                                    </div>
                                    <div class="col-md-6 col-lg-3">
                                        <div class="form-group">
                                            <label for="zip">ZIP</label>
                                            <input id="zip" name="zip" type="text" class="form-control">
                                        </div>
                                    </div>
                                    <div class="col-md-6 col-lg-3">
                                        <div class="form-group">
                                            <label for="state">City</label>
                                            <select id="city" name="city" class="form-control">
                                                 <c:forEach var="c" items="${map.cities}">
                                                     <option value="${c.name}">${c.name}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-md-6 col-lg-3">
                                        <div class="form-group">
                                            <label for="country">Country</label>
                                            <select id="country" name="country" class="form-control">
                                                <c:forEach var="c" items="${map.countries}">
                                                    <option value="${c.name}">${c.name}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="phone">Telephone</label>
                                            <input id="phone" name="phone" type="text" class="form-control">
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="email">Email</label>
                                            <input id="email" name="email" type="text" class="form-control">
                                        </div>
                                    </div>
                                </div>
                                <!-- /.row-->
                            </div>
                            <div class="box-footer d-flex justify-content-between"><a href="/basket/cart" class="btn btn-outline-secondary"><i class="fa fa-chevron-left"></i>Back to Basket</a>
                                <button type="submit" class="btn btn-primary">Continue to Delivery Method<i class="fa fa-chevron-right"></i></button>
                            </div>
                        </form>
                    </div>
                    <!-- /.box-->
                </div>
                <!-- /.col-lg-9-->
                
                <!-- /.col-lg-3-->
            </div>
        </div>
    </div>
</div>
<jsp:include page="/WEB-INF/jsp/home/footer1.jsp" />
<jsp:include page="/WEB-INF/jsp/home/footer.jsp" />