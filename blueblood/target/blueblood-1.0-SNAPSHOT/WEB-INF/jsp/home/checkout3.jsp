<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/home/header.jsp" />
<jsp:include page="/WEB-INF/jsp/home/navbar.jsp" />
              <div class="row">
                        <div class="offset-xl-2 col-xl-8 col-lg-12 col-md-12 col-sm-12 col-12">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="card">
                                        <div class="card-header">
                                            <h4 class="mb-0">Payment System</h4>
                                        </div>
                                        <div class="card-body">
                                            <form action="/checkout/checkout4">
                         
                                                <hr class="mb-4">
                                                <h4 class="mb-3">Payment</h4>
                                                <div class="col-md-6 d-block my-3">
                                                    <select name="mName" class="form-control">
                                                        <option value="Credit Card">Credit Card</option>
                                                        <option value="Debit Card">Debit Card</option>
                                                    </select>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-6 mb-3">
                                                        <label>Name on card</label>
                                                        <input type="text" name="name" class="form-control">
                                                        <small class="text-muted">Full name as displayed on card</small>                                                        
                                                    </div>
                                                    <div class="col-md-6 mb-3">
                                                        <label>Credit card number</label>
                                                        <input type="text" name="cardNo" class="form-control">
                                                        
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-3 mb-3">
                                                        <label>Expiration</label>
                                                        <input type="text" name="eDate" class="form-control">
                                                      
                                                    </div>
                                                    <div class="col-md-3 mb-3">
                                                        <label>CVV</label>
                                                        <input type="text" name="ccv" class="form-control"> 
                                                    </div>
                                                </div>
                                                <hr class="mb-4">
                                                <c:forEach var="t" items="${map.tList}">
                                                    <input type="hidden" name="cId" value="${t.cId}"/>
                                                </c:forEach>
                                                <button class="btn btn-primary btn-lg btn-block" type="submit">Continue to checkout</button>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                                
                            </div>
                        </div>
                    </div>
         
            <!-- /.col-lg-9-->
  
   <jsp:include page="/WEB-INF/jsp/home/footer1.jsp" />
<jsp:include page="/WEB-INF/jsp/home/footer.jsp" />