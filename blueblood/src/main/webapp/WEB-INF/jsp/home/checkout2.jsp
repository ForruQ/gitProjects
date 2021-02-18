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
                  <li class="breadcrumb-item"><a href="/home/home">Home</a></li>
                  <li aria-current="page" class="breadcrumb-item active">Checkout - Delivery method</li>
                </ol>
              </nav>
            </div>
            <div id="checkout" class="col-lg-9">
              <div class="box">
                <form method="get" action="/checkout/checkout3">
                  <h1>Checkout - Delivery method</h1>
                  <div class="nav flex-column flex-sm-row nav-pills"><a href="/home/checkout1" class="nav-link flex-sm-fill text-sm-center"> <i class="fa fa-map-marker">                  </i>Address</a><a href="checkout2.html" class="nav-link flex-sm-fill text-sm-center active"> <i class="fa fa-truck">                       </i>Delivery Method</a><a href="#" class="nav-link flex-sm-fill text-sm-center disabled"> <i class="fa fa-money">                      </i>Payment Method</a><a href="#" class="nav-link flex-sm-fill text-sm-center disabled"> <i class="fa fa-eye">                     </i>Order Review</a></div>
                  <div class="content py-3">
                    <div class="row">
                      <div class="col-md-12">
                        <div class="box shipping-method">
                            <h1>Choose your Delivery method</h1>
                            <h3>Note : If you are in out side Dhaka then Delivery option will only by courier Service or by bus. Only The people of Dhaka will get Product directly by Delivery man.</h3>
                            <Select class="form-control my-5" name="dMethod">
                                <option value="Dhaka">Dhaka</option>
                                <option value="Others">Others</option>
                               
                            </Select>
                        </div>
                      </div>
                      
                      
                    </div>
                  </div>
                  <div class="box-footer d-flex justify-content-between"><a href="/home/checkout1" class="btn btn-outline-secondary"><i class="fa fa-chevron-left"></i>Back to address</a>
                    <button type="submit" class="btn btn-primary">Continue to Payment Method<i class="fa fa-chevron-right"></i></button>
                  </div>
                </form>
              </div>
              <!-- /.box-->
            </div>
            <!-- /.col-md-9-->
            <div class="col-md-3">
              
            </div>
            <!-- /.col-md-3-->
          </div>
        </div>
      </div>
    </div>
<jsp:include page="/WEB-INF/jsp/home/footer1.jsp" />
<jsp:include page="/WEB-INF/jsp/home/footer.jsp" />