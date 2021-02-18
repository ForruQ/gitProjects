<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
 
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/resources/assets/vendor/bootstrap/css/bootstrap.min.css">
    <link href="/resources/assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
    <link rel="stylesheet" href="/resources/assets/libs/css/style.css">
    <link rel="stylesheet" href="/resources/assets/vendor/fonts/fontawesome/css/fontawesome-all.css">
    <link rel="stylesheet" href="/resources/assets/vendor/charts/chartist-bundle/chartist.css">
    <link rel="stylesheet" href="/resources/assets/vendor/charts/morris-bundle/morris.css">
    <link rel="stylesheet" href="/resources/assets/vendor/fonts/material-design-iconic-font/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="/resources/assets/vendor/charts/c3charts/c3.css">
    <link rel="stylesheet" href="/resources/assets/vendor/fonts/flag-icon-css/flag-icon.min.css">
    <title>Blue Blood</title>
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
                    <a class="navbar-brand" href="/dash/dash">Blue Blood</a>
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
                                            Forruq Ahammed</h5>
                                        <span class="status"></span><span class="ml-2">Available</span>
                                    </div>
                                    <a class="dropdown-item" href="/dash/dash"><i class="fas fa-user mr-2"></i>Account</a>
                                    
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
                                                <a class="nav-link" href="/" data-toggle="collapse" aria-expanded="false" data-target="#submenu-1-2" aria-controls="submenu-1-2">Blue Blood</a>
                                                <div id="submenu-1-2" class="collapse submenu" style="">
                                                    <ul class="nav flex-column">
                                                        <li class="nav-item">
                                                            <a class="nav-link" href="/dash/dash">DashBoard</a>
                                                        </li>
                                                        <li class="nav-item">
                                                            <a class="nav-link" href="/dash/sales">Sales Overview</a>
                                                        </li>
                                                       
                                                    </ul>
                                                </div>
                                            </li>
                                            
                                            <li class="nav-item">
                                                <a class="nav-link" href="#" data-toggle="collapse" aria-expanded="false" data-target="#submenu-1-1" aria-controls="submenu-1-1">Sales Report</a>
                                                <div id="submenu-1-1" class="collapse submenu" style="">
                                                    <ul class="nav flex-column">
                                                        <li class="nav-item">
                                                            <a class="nav-link" href="/dash/dailySales">Daily Sales</a>
                                                        </li>
                                                        <li class="nav-item">
                                                            <a class="nav-link" href="/dash/weeklySales">Weekly Sales</a>
                                                        </li>
                                                        <li class="nav-item">
                                                            <a class="nav-link" href="/dash/monthlySales">Monthly Sales</a>
                                                        </li>
                                                        <li class="nav-item">
                                                            <a class="nav-link" href="/dash/yearlySales">Yearly Sales</a>
                                                        </li>
                                                        <li class="nav-item">
                                                            <a class="nav-link" href="/dash/topProduct">Top Products</a>
                                                        </li>
                                                        <li class="nav-item">
                                                            <a class="nav-link" href="/dash/salesByCustomer">Customer Wise Sales</a>
                                                        </li>
                                                        <li class="nav-item">
                                                            <a class="nav-link" href="/dash/salesByProduct">Product wise Sales</a>
                                                        </li>
                                                        
                                                    </ul>
                                                </div>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="/purchase/view">Purchase Report</a>
                                           </li>
                                           <li class="nav-item">
                                                <a class="nav-link" href="/stock/report">Stock Report</a>
                                           </li>
                                           <li class="nav-item">
                                                <a class="nav-link" href="/stock/profit">Profit Report</a>
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
                                            
                                        </ul>
                                    </div>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#" data-toggle="collapse" aria-expanded="false" data-target="#submenu-5" aria-controls="submenu-5"><i class="fas fa-fw fa-table"></i>Sales</a>
                                    <div id="submenu-5" class="collapse submenu" style="">
                                        <ul class="nav flex-column">
                                            <li class="nav-item">
                                                <a class="nav-link" href="/sales/view">Sales List</a>
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
            <div class="dashboard-ecommerce">
                <div class="container-fluid dashboard-content ">
                    <!-- ============================================================== -->
                    <!-- pageheader  -->
                    <!-- ============================================================== -->
                    <div class="row">
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                            <div class="page-header">
                                <h2 class="pageheader-title">Admin Dashboard</h2>
                                <p class="pageheader-text">Nulla euismod urna eros, sit amet scelerisque torton lectus vel mauris facilisis faucibus at enim quis massa lobortis rutrum.</p>
                                <div class="page-breadcrumb">
                                    <nav aria-label="breadcrumb">
                                        <ol class="breadcrumb">
                                            <li class="breadcrumb-item"><a href="#" class="breadcrumb-link">Dashboard</a></li>
                                            <li class="breadcrumb-item active" aria-current="page">Admin Dashboard</li>
                                        </ol>
                                    </nav>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- ============================================================== -->
                    <!-- end pageheader  -->
                    <!-- ============================================================== -->
                    <div class="ecommerce-widget">

                        <div class="row">
                            <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12 col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <h5 class="text-muted">Total Profit</h5>
                                        <div class="metric-value d-inline-block">
                                            <h1 class="mb-1">${map.totalIncome}</h1>
                                        </div>
                                        <div class="metric-label d-inline-block float-right text-success font-weight-bold">
                                            <span><i class="fa fa-fw fa-arrow-up"></i></span><span>5.86%</span>
                                        </div>
                                    </div>
                                    <div id="sparkline-revenue"></div>
                                </div>
                            </div>
                            <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12 col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <h5 class="text-muted">Total Purchase Amount</h5>
                                        <div class="metric-value d-inline-block">
                                            <h1 class="mb-1">${map.totalCost}</h1>
                                        </div>
                                        <div class="metric-label d-inline-block float-right text-success font-weight-bold">
                                            <span><i class="fa fa-fw fa-arrow-up"></i></span><span>5.86%</span>
                                        </div>
                                    </div>
                                    <div id="sparkline-revenue2"></div>
                                </div>
                            </div>
                            <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12 col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <h5 class="text-muted">Total Sales Amount</h5>
                                        <div class="metric-value d-inline-block">
                                            <h1 class="mb-1">${map.totalSales}</h1>
                                        </div>
                                        <div class="metric-label d-inline-block float-right text-primary font-weight-bold">
                                            <span>N/A</span>
                                        </div>
                                    </div>
                                    <div id="sparkline-revenue3"></div>
                                </div>
                            </div>
                            <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12 col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <h5 class="text-muted">Stock Amount</h5>
                                        <div class="metric-value d-inline-block">
                                            <h1 class="mb-1">${map.investment}</h1>
                                        </div>
                                        <div class="metric-label d-inline-block float-right text-secondary font-weight-bold">
                                            <span>-2.00%</span>
                                        </div>
                                    </div>
                                    <div id="sparkline-revenue4"></div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <!-- ============================================================== -->
                      
                            <!-- ============================================================== -->

                                          <!-- recent orders  -->
                            <!-- ============================================================== -->
                            <div class="col-xl-9 col-lg-12 col-md-6 col-sm-12 col-12">
                                <div class="card">
                                    <h5 class="card-header">Recent Orders</h5>
                                    <div class="card-body p-0">
                                        <div class="table-responsive">
                                            <table class="table">
                                                <thead class="bg-light">
                                                    <tr class="border-0">
                                                        <th class="border-0">Order Date</th>
                                                        <th class="border-0">OrderNo</th>               
                                                        <th class="border-0">SubTotal</th>
                                                        <th class="border-0">Vat</th>
                                                        <th class="border-0">Delivery Charge</th>
                                                        <th class="border-0">Grand Total</th>
                                                        <th class="border-0">Customer</th>
                                                        <th class="border-0">Status</th>
                                                       
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach var="o" items="${map.iList}">
                                                    <tr>
                                               
                                                        <td>${o.orderDate} </td>
                                                        <td>${o.orderNo} </td>
                                                        <td>${o.subTotal} </td>
                                                        <td>${o.vat} %</td>
                                                        <td>${o.dCharge} </td>
                                                        <td>${o.grandTotal} </td>
                                                        <td>${o.customer} </td>
            
                                                        <td><span class="badge-dot badge-brand mr-1"></span>New</td>
                                                    </tr>
                                                     </c:forEach>

                                                    
                                                    <tr>
                                                        <td colspan="9"><a href="#" class="btn btn-outline-light float-right">View Details</a></td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- ============================================================== -->
                            <!-- end recent orders  -->

    
                            <!-- ============================================================== -->
                            <!-- ============================================================== -->
                            <!-- customer acquistion  -->
                            <!-- ============================================================== -->
                            <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12 col-12">
                                <div class="card">
                                    <h5 class="card-header">Customer Acquisition</h5>
                                    <div class="card-body">
                                        <div class="ct-chart ct-golden-section" style="height: 354px;"></div>
                                        <div class="text-center">
                                            <span class="legend-item mr-2">
                                                    <span class="fa-xs text-primary mr-1 legend-tile"><i class="fa fa-fw fa-square-full"></i></span>
                                            <span class="legend-text">Returning</span>
                                            </span>
                                            <span class="legend-item mr-2">

                                                    <span class="fa-xs text-secondary mr-1 legend-tile"><i class="fa fa-fw fa-square-full"></i></span>
                                            <span class="legend-text">First Time</span>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- ============================================================== -->
                            <!-- end customer acquistion  -->
                            <!-- ============================================================== -->
                        </div>
                        

                        
                            <!-- ============================================================== -->
                            <!-- end sales  -->
                            <!-- ============================================================== -->
                            <!-- ============================================================== -->
                            <!-- new customer  -->
                            <!-- ============================================================== -->
                            
                            <!-- ============================================================== -->
                            <!-- end new customer  -->
                            <!-- ============================================================== -->
                            <!-- ============================================================== -->
                            <!-- visitor  -->
                            <!-- ============================================================== -->
                            
                            <!-- ============================================================== -->
                            <!-- end visitor  -->
                            <!-- ============================================================== -->
                            <!-- ============================================================== -->
                            <!-- total orders  -->
                            <!-- ============================================================== -->
                            
                            </div>
                            <!-- ============================================================== -->
                            <!-- end total orders  -->
                            <!-- ============================================================== -->
                        </div>
                        <div class="row">
                            <!-- ============================================================== -->
                            <!-- total revenue  -->
                            <!-- ============================================================== -->
  
                            
                            <!-- ============================================================== -->
                            <!-- ============================================================== -->
                            <!-- category revenue  -->
                            <!-- ============================================================== -->
                            
                            <!-- ============================================================== -->
                            <!-- end category revenue  -->
                            <!-- ============================================================== -->

                            
                        </div>
                        
                    </div>
                </div>
            </div>
            <!-- ============================================================== -->
            <!-- footer -->
            <!-- ============================================================== -->
            <div class="footer">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 col-12">
                             Copyright © 2018 Concept. All rights reserved. Dashboard by <a href="https://colorlib.com/wp/">Colorlib</a>.
                        </div>
                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 col-12">
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
        <!-- ============================================================== -->
        <!-- end wrapper  -->
        <!-- ============================================================== -->
    </div>
    
   
    <script src="/resources/assets/vendor/jquery/jquery-3.3.1.min.js"></script>
    <!-- bootstap bundle js -->
    <script src="/resources/assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
    <!-- slimscroll js -->
    <script src="/resources/assets/vendor/slimscroll/jquery.slimscroll.js"></script>
    <!-- main js -->
    <script src="/resources/assets/libs/js/main-js.js"></script>
    <!-- chart chartist js -->
    <script src="/resources/assets/vendor/charts/chartist-bundle/chartist.min.js"></script>
    <!-- sparkline js -->
    <script src="/resources/assets/vendor/charts/sparkline/jquery.sparkline.js"></script>
    <!-- morris js -->
    <script src="/resources/assets/vendor/charts/morris-bundle/raphael.min.js"></script>
    <script src="/resources/assets/vendor/charts/morris-bundle/morris.js"></script>
    <!-- chart c3 js -->
    <script src="/resources/assets/vendor/charts/c3charts/c3.min.js"></script>
    <script src="/resources/assets/vendor/charts/c3charts/d3-5.4.0.min.js"></script>
    <script src="/resources/assets/vendor/charts/c3charts/C3chartjs.js"></script>
    <script src="/resources/assets/libs/js/dashboard-ecommerce.js"></script>
</body>
 
</html>