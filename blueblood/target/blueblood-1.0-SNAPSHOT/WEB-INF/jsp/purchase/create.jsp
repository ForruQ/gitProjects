<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Concept - Bootstrap 4 Admin Dashboard Template</title>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="/resources/assets/vendor/bootstrap/css/bootstrap.min.css">
        <link href="/resources/assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
        <link rel="stylesheet" href="/resources/assets/libs/css/style.css">
        <link rel="stylesheet" href="/resources/assets/vendor/fonts/fontawesome/css/fontawesome-all.css">
        <link rel="stylesheet" href="/resources/assets/vendor/datepicker/tempusdominus-bootstrap-4.css" />
        <link rel="stylesheet" href="/resources/assets/vendor/inputmask/css/inputmask.css" />
    </head>

    <body>
        <!-- ============================================================== -->
        <!-- main wrapper -->
        <!-- ============================================================== -->
        <div class="dashboard-main-wrapper">
            <!-- ============================================================== -->
            <!-- navbar -->
            <!-- ============================================================== -->
            <div class="dashboard-header">
                <nav class="navbar navbar-expand-lg bg-white fixed-top">
                    <a class="navbar-brand" href="/">Blue Blood</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse " id="navbarSupportedContent">
                        <ul class="navbar-nav ml-auto navbar-right-top">
                            <li class="nav-item">
                                <div id="custom-search" class="top-search-bar">
                                    <input class="form-control" type="text" placeholder="Search..">
                                </div>
                            </li>
                            <li class="nav-item dropdown notification">
                                <a class="nav-link nav-icons" href="#" id="navbarDropdownMenuLink1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fas fa-fw fa-bell"></i> <span class="indicator"></span></a>
                                <ul class="dropdown-menu dropdown-menu-right notification-dropdown">
                                    <li>
                                        <div class="notification-title"> Notification</div>
                                        <div class="notification-list">
                                            <div class="list-group">
                                                <a href="#" class="list-group-item list-group-item-action active">
                                                    <div class="notification-info">
                                                        <div class="notification-list-user-img"><img src="/resources/assets/images/avatar-2.jpg" alt="" class="user-avatar-md rounded-circle"></div>
                                                        <div class="notification-list-user-block"><span class="notification-list-user-name">Jeremy Rakestraw</span>accepted your invitation to join the team.
                                                            <div class="notification-date">2 min ago</div>
                                                        </div>
                                                    </div>
                                                </a>
                                                <a href="#" class="list-group-item list-group-item-action">
                                                    <div class="notification-info">
                                                        <div class="notification-list-user-img"><img src="/resources/assets/images/avatar-3.jpg" alt="" class="user-avatar-md rounded-circle"></div>
                                                        <div class="notification-list-user-block"><span class="notification-list-user-name">
                                                                John Abraham</span>is now following you
                                                            <div class="notification-date">2 days ago</div>
                                                        </div>
                                                    </div>
                                                </a>
                                                <a href="#" class="list-group-item list-group-item-action">
                                                    <div class="notification-info">
                                                        <div class="notification-list-user-img"><img src="/resources/assets/images/avatar-4.jpg" alt="" class="user-avatar-md rounded-circle"></div>
                                                        <div class="notification-list-user-block"><span class="notification-list-user-name">Monaan Pechi</span> is watching your main repository
                                                            <div class="notification-date">2 min ago</div>
                                                        </div>
                                                    </div>
                                                </a>
                                                <a href="#" class="list-group-item list-group-item-action">
                                                    <div class="notification-info">
                                                        <div class="notification-list-user-img"><img src="/resources/assets/images/avatar-5.jpg" alt="" class="user-avatar-md rounded-circle"></div>
                                                        <div class="notification-list-user-block"><span class="notification-list-user-name">Jessica Caruso</span>accepted your invitation to join the team.
                                                            <div class="notification-date">2 min ago</div>
                                                        </div>
                                                    </div>
                                                </a>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="list-footer"> <a href="#">View all notifications</a></div>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item dropdown connection">
                                <a class="nav-link" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="fas fa-fw fa-th"></i> </a>
                                <ul class="dropdown-menu dropdown-menu-right connection-dropdown">
                                    <li class="connection-list">
                                        <div class="row">
                                            <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
                                                <a href="#" class="connection-item"><img src="/resources/assets/images/github.png" alt="" > <span>Github</span></a>
                                            </div>
                                            <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
                                                <a href="#" class="connection-item"><img src="/resources/assets/images/dribbble.png" alt="" > <span>Dribbble</span></a>
                                            </div>
                                            <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
                                                <a href="#" class="connection-item"><img src="/resources/assets/images/dropbox.png" alt="" > <span>Dropbox</span></a>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
                                                <a href="#" class="connection-item"><img src="/resources/assets/images/bitbucket.png" alt=""> <span>Bitbucket</span></a>
                                            </div>
                                            <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
                                                <a href="#" class="connection-item"><img src="/resources/assets/images/mail_chimp.png" alt="" ><span>Mail chimp</span></a>
                                            </div>
                                            <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12 col-12 ">
                                                <a href="#" class="connection-item"><img src="/resources/assets/images/slack.png" alt="" > <span>Slack</span></a>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="conntection-footer"><a href="#">More</a></div>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item dropdown nav-user">
                                <a class="nav-link nav-user-img" href="#" id="navbarDropdownMenuLink2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><img src="/resources/assets/images/avatar-1.jpg" alt="" class="user-avatar-md rounded-circle"></a>
                                <div class="dropdown-menu dropdown-menu-right nav-user-dropdown" aria-labelledby="navbarDropdownMenuLink2">
                                    <div class="nav-user-info">
                                        <h5 class="mb-0 text-white nav-user-name">
                                            John Abraham</h5>
                                        <span class="status"></span><span class="ml-2">Available</span>
                                    </div>
                                    <a class="dropdown-item" href="#"><i class="fas fa-user mr-2"></i>Account</a>
                                    <a class="dropdown-item" href="#"><i class="fas fa-cog mr-2"></i>Setting</a>
                                    <a class="dropdown-item" href="/"><i class="fas fa-power-off mr-2"></i>Logout</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
            <!-- ============================================================== -->
            <!-- end navbar -->
            <!-- ============================================================== -->
            <!-- ============================================================== -->
            <!-- left sidebar -->
            <!-- ============================================================== -->
            <div class="nav-left-sidebar sidebar-dark">
                <div class="menu-list">
                    <nav class="navbar navbar-expand-lg navbar-light">
                        <a class="d-xl-none d-lg-none" href="#">Dashboard</a>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarNav">
                            <ul class="navbar-nav flex-column">
                                <li class="nav-divider">
                                    Menu
                                </li>
                                <li class="nav-item ">
                                    <a class="nav-link active" href="#" data-toggle="collapse" aria-expanded="false" data-target="#submenu-1" aria-controls="submenu-1"><i class="fa fa-fw fa-user-circle"></i>Dashboard <span class="badge badge-success">6</span></a>
                                    <div id="submenu-1" class="collapse submenu" style="">
                                        <ul class="nav flex-column">
                                            <li class="nav-item">
                                                <a class="nav-link" href="/" data-toggle="collapse" aria-expanded="false" data-target="#submenu-1-2" aria-controls="submenu-1-2">E-Commerce</a>
                                                <div id="submenu-1-2" class="collapse submenu" style="">
                                                    <ul class="nav flex-column">
                                                        <li class="nav-item">
                                                            <a class="nav-link" href="/">E Commerce Dashboard</a>
                                                        </li>
                                                        <li class="nav-item">
                                                            <a class="nav-link" href="../ecommerce-product.html">Product List</a>
                                                        </li>
                                                        <li class="nav-item">
                                                            <a class="nav-link" href="../ecommerce-product-single.html">Product Single</a>
                                                        </li>
                                                        <li class="nav-item">
                                                            <a class="nav-link" href="../ecommerce-product-checkout.html">Product Checkout</a>
                                                        </li>
                                                    </ul>
                                                </div>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="../dashboard-finance.html">Finance</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="../dashboard-sales.html">Sales</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="#" data-toggle="collapse" aria-expanded="false" data-target="#submenu-1-1" aria-controls="submenu-1-1">Infulencer</a>
                                                <div id="submenu-1-1" class="collapse submenu" style="">
                                                    <ul class="nav flex-column">
                                                        <li class="nav-item">
                                                            <a class="nav-link" href="../dashboard-influencer.html">Influencer</a>
                                                        </li>
                                                        <li class="nav-item">
                                                            <a class="nav-link" href="../influencer-finder.html">Influencer Finder</a>
                                                        </li>
                                                        <li class="nav-item">
                                                            <a class="nav-link" href="../influencer-profile.html">Influencer Profile</a>
                                                        </li>
                                                    </ul>
                                                </div>
                                            </li>
                                        </ul>
                                    </div>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#" data-toggle="collapse" aria-expanded="false" data-target="#submenu-2" aria-controls="submenu-2"><i class="fa fa-fw fa-rocket"></i>Orders</a>
                                    <div id="submenu-2" class="collapse submenu" style="">
                                        <ul class="nav flex-column">
                                            <li class="nav-item">
                                                <a class="nav-link" href="/orders/details">Recent Orders<span class="badge badge-secondary">New</span></a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="/orders/dView">Completed Orders</a>
                                            </li>
                                            
                                        </ul>
                                    </div>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#" data-toggle="collapse" aria-expanded="false" data-target="#submenu-3" aria-controls="submenu-3"><i class="fas fa-fw fa-chart-pie"></i>Product</a>
                                    <div id="submenu-3" class="collapse submenu" style="">
                                        <ul class="nav flex-column">
                                            <li class="nav-item">
                                                <a class="nav-link" href="/product/create">Add</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="/product/view">View</a>
                                            </li>
                                           
                                            <li class="nav-item">
                                                <a class="nav-link" href="chart-morris.html">Update</a>
                                            </li>
                                        </ul>
                                    </div>
                                </li>
                                <li class="nav-item ">
                                    <a class="nav-link" href="#" data-toggle="collapse" aria-expanded="false" data-target="#submenu-4" aria-controls="submenu-4"><i class="fab fa-fw fa-wpforms"></i>Purchase</a>
                                    <div id="submenu-4" class="collapse submenu" style="">
                                        <ul class="nav flex-column">
                                            <li class="nav-item">
                                                <a class="nav-link" href="/purchase/create">Purchase</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="/purchase/view">Purchase List</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="multiselect.html">Purchase Report</a>
                                            </li>
                                        </ul>
                                    </div>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#" data-toggle="collapse" aria-expanded="false" data-target="#submenu-5" aria-controls="submenu-5"><i class="fas fa-fw fa-table"></i>Sales</a>
                                    <div id="submenu-5" class="collapse submenu" style="">
                                        <ul class="nav flex-column">
                                            <li class="nav-item">
                                                <a class="nav-link" href="general-table.html">Sales List</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="data-tables.html">Sales Report</a>
                                            </li>
                                        </ul>
                                    </div>
                                </li>
                                <li class="nav-divider">
                                    Others
                                </li>
                                
                                <li class="nav-item">
                                    <a class="nav-link" href="#" data-toggle="collapse" aria-expanded="false" data-target="#submenu-8" aria-controls="submenu-8"><i class="fas fa-fw fa-columns"></i>Category</a>
                                    <div id="submenu-8" class="collapse submenu" style="">
                                        <ul class="nav flex-column">
                                            <li class="nav-item">
                                                <a class="nav-link" href="/category/create">Add</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="/category/view">View</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="/category/updateView">Update</a>
                                            </li>
                                            
                                        </ul>
                                    </div>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#" data-toggle="collapse" aria-expanded="false" data-target="#submenu-9" aria-controls="submenu-9"><i class="fas fa-fw fa-map-marker-alt"></i>City</a>
                                    <div id="submenu-9" class="collapse submenu" style="">
                                        <ul class="nav flex-column">
                                            <li class="nav-item">
                                                <a class="nav-link" href="/city/create">Add</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="/city/view">View</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="/city/updateView">Update</a>
                                            </li>
                                        </ul>
                                    </div>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#" data-toggle="collapse" aria-expanded="false" data-target="#submenu-10" aria-controls="submenu-10"><i class="fas fa-f fa-folder"></i>Country</a>
                                    <div id="submenu-10" class="collapse submenu" style="">
                                        <ul class="nav flex-column">
                                            <li class="nav-item">
                                                <a class="nav-link" href="/country/create">Add</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="/country/view">View</a>
                                            </li>
                                            
                                            <li class="nav-item">
                                                <a class="nav-link" href="/country/updateView">Update</a>
                                            </li>
                                        </ul>
                                    </div>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#" data-toggle="collapse" aria-expanded="false" data-target="#submenu-11" aria-controls="submenu-11"><i class="fas fa-f fa-folder"></i>User</a>
                                    <div id="submenu-11" class="collapse submenu" style="">
                                        <ul class="nav flex-column">
                                            <li class="nav-item">
                                                <a class="nav-link" href="/user/view">User List</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="/address/view">User Address</a>
                                            </li>
                                            
                                        </ul>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </nav>
                </div>
            </div>
            <!-- ============================================================== -->
            <!-- end left sidebar -->
            <!-- ============================================================== -->
            <!-- ============================================================== -->
            <!-- wrapper  -->
            <!-- ============================================================== -->
            <div class="dashboard-wrapper">
                <div class="container-fluid dashboard-content">
                    <div class="row">
                        <div class="col-xl-1"></div>
                        <div class="col-xl-10">

                            <!-- ============================================================== -->
                            <!-- Product form  -->
                            <!-- ============================================================== -->
                            <div class="row ml-auto">
                                <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                                    <div class="section-block" id="basicform">
                                        <h3 class="section-title text-center">Purchase</h3>
                                    </div>
                                    <div class="card">
                                        <div class="card-header">

                                        </div>
                                        <div class="card-body">
                                            <div class="container-fluid">
                                                <div class="row">
                                                    <div class="col-md-4">
                                                        <form action="/purchase/search" method="GET"> 
                                                            <input type="text" name="pId"/>
                                                            <input class="btn-info" type="submit" value="Search"/>
                                                        </form>
                                                    </div>
                                                    <div class="col-md-3"></div>
                                                    <div class="col-md-5 float-right" >
                                                        <img  src="/resources/product/img/${product.pPhoto}" width="250px" height="200px"/>
                                                    </div>
                                                </div>
                                            </div>
                                            <form action="/purchase/save" method="POST">
                                                <div class="form-group">
                                                    <input name="pId" type="hidden" value="${product.pId}" class="form-control">
                                                </div>
                                                <div class="form-group">
                                                    <label  class="col-form-label">Name</label>
                                                    <input name="pName" type="text" value="${product.pName}" class="form-control">
                                                </div>
                                                <div class="form-group">
                                                    <label  class="col-form-label">Code</label>
                                                    <input name="pCode" type="text" value="${product.pCode}" class="form-control">
                                                </div>
                                                <div class="form-group">
<!--                                                    <label  class="col-form-label"></label>-->
                                                    <input name="cId" type="hidden" value="${product.cId}" class="form-control">
                                                </div>
                                                <div class="form-group">
                                                    <label  class="col-form-label">Category</label>
                                                    <input name="cName" type="text" value="${product.cName}" class="form-control">
                                                </div>

                                                <div>
<!--                                                    <label  class="col-form-label"></label>-->
                                                    <input name="pDesc" type="hidden"  value="${product.pDesc}" class="form-control"/>
                                                </div>
                                                <div >
<!--                                                    <label  class="col-form-label"></label>-->
                                                    <input name="pPhoto" type="hidden" value="${product.pPhoto}" class="form-control">
                                                </div>
                                                <div class="form-group">
                                                    <label  class="col-form-label">Cost</label>
                                                    <input name="pCost" id="pCost" type="number" class="form-control">
                                                </div>
                                                <div class="form-group">
                                                    <label  class="col-form-label">Quantity</label>
                                                    <input name="qty" id="qty" type="number" class="form-control">
                                                </div>
                                                <div class="form-group">
                                                    <label  class="col-form-label">Total</label>
                                                    <input name="total" id="total" type="number" class="form-control">
                                                </div>
                                                <div class="form-group">
                                                    <label  class="col-form-label">VAT</label>
                                                    <input name="vat"id="vat" type="number" class="form-control">
                                                </div>
                                                <div class="form-group">
                                                    <label  class="col-form-label">Grand Total</label>
                                                    <input name="grandTotal" id="grandTotal" type="number" class="form-control">
                                                </div>

                                                <div class="form-group">   
                                                    <input class="btn btn-lg btn-info"  type="submit" value="Save"/>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- ============================================================== -->
                            <!-- end basic form  -->
                            <!-- ============================================================== -->
                            <!-- ============================================================== -->
                            <!-- ============================================================== -->
                        </div>
                    </div>
                    <!-- ============================================================== -->
                    <!-- footer -->
                    <!-- ============================================================== -->
                    <div class="footer">
                        <div class="container-fluid">
                            <div class="row">
                                <div class="col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12">
                                    Copyright � 2018 Concept. All rights reserved. Dashboard by <a href="https://colorlib.com/wp/">Colorlib</a>.
                                </div>
                                <div class="col-xl-6 col-lg-6 col-md-12 col-sm-12 col-12">
                                    <div class="text-md-right footer-links d-none d-sm-block">
                                        <a href="javascript: void(0);">About</a>
                                        <a href="javascript: void(0);">Support</a>
                                        <a href="javascript: void(0);">Contact Us</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- ============================================================== -->
                    <!-- end footer -->
                    <!-- ============================================================== -->
                </div>
            </div>
            <!-- ============================================================== -->
            <!-- end main wrapper -->
            <!-- ============================================================== -->
            <!-- Optional JavaScript -->
            <script src="/resources/assets/vendor/jquery/jquery-3.3.1.min.js"></script>
            <script src="/resources/assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
            <script src="/resources/assets/vendor/slimscroll/jquery.slimscroll.js"></script>
            <script src="/resources/assets/libs/js/main-js.js"></script>
            <script src="/resources/assets/vendor/inputmask/js/jquery.inputmask.bundle.js"></script>
            <script>
                $(function (e) {
                    "use strict";
                    $(".date-inputmask").inputmask("dd/mm/yyyy"),
                            $(".phone-inputmask").inputmask("(999) 999-9999"),
                            $(".international-inputmask").inputmask("+9(999)999-9999"),
                            $(".xphone-inputmask").inputmask("(999) 999-9999 / x999999"),
                            $(".purchase-inputmask").inputmask("aaaa 9999-****"),
                            $(".cc-inputmask").inputmask("9999 9999 9999 9999"),
                            $(".ssn-inputmask").inputmask("999-99-9999"),
                            $(".isbn-inputmask").inputmask("999-99-999-9999-9"),
                            $(".currency-inputmask").inputmask("$9999"),
                            $(".percentage-inputmask").inputmask("99%"),
                            $(".decimal-inputmask").inputmask({
                        alias: "decimal",
                        radixPoint: "."
                    }),
                            $(".email-inputmask").inputmask({
                        mask: "*{1,20}[.*{1,20}][.*{1,20}][.*{1,20}]@*{1,20}[*{2,6}][*{1,2}].*{1,}[.*{2,6}][.*{1,2}]",
                        greedy: !1,
                        onBeforePaste: function (n, a) {
                            return (e = e.toLowerCase()).replace("mailto:", "")
                        },
                        definitions: {
                            "*": {
                                validator: "[0-9A-Za-z!#$%&'*+/=?^_`{|}~/-]",
                                cardinality: 1,
                                casing: "lower"
                            }
                        }
                    })
                });
            </script>
            <script>
                $("#qty").focusout(function () {
                    var qty = $("#qty").val();
                    var pCost = $("#pCost").val();
                    var total = $("#total").val();
                     var totals = parseInt(pCost) * parseInt(qty);
                    $("#total").val("");
                    $("#total").val(totals);
                });
                $("#pCost").focusout(function () {
                    var qty = $("#qty").val();
                    var pCost = $("#pCost").val();
                    var total = $("#total").val();
                     var totals = parseInt(pCost) * parseInt(qty);
                    $("#total").val("");
                    $("#total").val(totals);
                });
                 $("#pCost").focusin(function () {
                    var qty = $("#qty").val();
                    var pCost = $("#pCost").val();
                    var total = $("#total").val();
                    var totals = parseInt(pCost) * parseInt(qty);
                    $("#total").val("");
                    $("#total").val(totals);
                });
                $("#vat").focusout(function () {
                    var vat = $("#vat").val();
                    var total = $("#total").val();
                    var grandTotal = $("#grandTotal").val();
                  
                     var grandTotals = parseInt(( parseInt(total) + (parseInt(total) * parseInt(vat)/100)));
                    $("#grandTotal").val("");
                    $("#grandTotal").val(grandTotals);
                });
                 $("#vat").focusin(function () {
                    var vat = $("#vat").val();
                    var total = $("#total").val();
                    var grandTotal = $("#grandTotal").val();
                  
                     var grandTotals =grandTotal-grandTotal ;
                    $("#grandTotal").val("");
                    $("#grandTotal").val(grandTotals);
                });


              

            </script>
    </body>

</html>
