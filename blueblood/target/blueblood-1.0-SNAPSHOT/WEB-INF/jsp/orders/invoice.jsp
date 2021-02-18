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
    <title>Concept - Bootstrap 4 Admin Dashboard Template</title>
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
                                <h2 class="pageheader-title">Product Invoice </h2>
                                <p class="pageheader-text"></p>
                                <div class="page-breadcrumb">
                                    <nav aria-label="breadcrumb">
                                        <ol class="breadcrumb">
                                            <li class="breadcrumb-item"><a href="#" class="breadcrumb-link">E-coommerce</a></li>
                                            <li class="breadcrumb-item active" aria-current="page">E-Commerce Product Invoice</li>
                                        </ol>
                                    </nav>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- ============================================================== -->
                    <!-- end pageheader  -->
                    <!-- ============================================================== -->
                    <div class="row">
                        <div class="offset-xl-2 col-xl-8 col-lg-12 col-md-12 col-sm-12 col-12">
                            <div class="card" id="invoice">
                                <div class="card-header p-4">
                                     <a class="pt-2 d-inline-block" href="index.html">Blue Blood</a>
                                   
                                    <div class="float-right"> <h3 class="mb-0"># ${map.invoice.orderNo}</h3>
                                   ${map.invoice.orderDate}</div>
                                   
                                </div>
                                <button onclick="printInvoice('invoice')" class="btn btn-white">Print</button>
                                <div class="card-body">
                                    <div class="row mb-4">
                                        <div class="col-sm-8">
                                     
                                            <h5 class="mb-3">From:</h5>                                            
                                            <h3 class="text-dark mb-1">Forruq Ahammed</h3>
                                         
                                            <div>97/8, Malibagh</div>
                                            <div>Malibah, Dhaka</div>
                                            <div>Email: forruqahammed@gmail.com</div>
                                            <div>Phone: 01786502638</div>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5 class="mb-3">To:</h5>
                                            <h3 class="text-dark mb-1">Safayet Ullah</h3>                                            
                                            <div>91/3, Shantibagh</div>
                                            <div>Malibagh, Dhaka</div>
                                            <div>safayet@gmail.com</div>
                                            <div>Phone: 01793047305</div>
                                        </div>
                                    </div>
                                    <div class="table-responsive-sm">
                                        <table class="table table-striped">
                                            <thead>
                                                <tr>
                                                    <th class="center">Name</th>
                                                    <th>Code</th>
                                                    <th>Unit Cost</th>
                                                    <th class="right">Discount</th>
                                                    <th class="center">Quantity</th>
                                                    <th class="right">Total</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach var="p" items="${map.oList}">
                                                <tr>
                                                    <td class="center">${p.pName}</td>
                                                    <td class="center">${p.pCode}</td>
                                                    <td class="right">${p.pPrice}</td>
                                                    <td class="center">${p.discount}</td>
                                                    <td class="center">${p.qty}</td>
                                                    <td class="right">${p.total}</td>
                                             
                                                </tr>
                                               </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-4 col-sm-5">
                                        </div>
                                        <div class="col-lg-4 col-sm-5 ml-auto">
                                            <table class="table table-clear">
                                                <tbody>
                                                    <tr>
                                                        <td class="left">
                                                            <strong class="text-dark">Subtotal</strong>
                                                        </td>
                                                        <td class="right">${map.invoice.subTotal}</td>
                                                    </tr>
                                                    <tr>
                                                        <td class="left">
                                                            <strong class="text-dark">Delivery Charge</strong>
                                                        </td>
                                                        <td class="right">${map.invoice.dCharge}</td>
                                                    </tr>
                                                    <tr>
                                                        <td class="left">
                                                            <strong class="text-dark">VAT</strong>
                                                        </td>
                                                        <td class="right">${map.invoice.vat}</td>
                                                    </tr>
                                                    <tr>
                                                        <td class="left">
                                                            <strong class="text-dark">Total</strong>
                                                        </td>
                                                        <td class="right">
                                                            <strong class="text-dark">${map.invoice.grandTotal}</strong>
                                                        </td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                                <div class="card-footer bg-white">
                                    <p class="mb-0">7/8 Shantibagh, Malibagh, Dhaka-1217</p>
                                     
                                </div>
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
    </div>
        <!-- ============================================================== -->
        <!-- end main wrapper  -->
        <!-- ============================================================== -->
        <!-- Optional JavaScript -->
        <!-- jquery 3.3.1 -->
        <script src="/resources/assets/vendor/jquery/jquery-3.3.1.min.js"></script>
        <!-- bootstap bundle js -->
        <script src="/resources/assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
        <!-- slimscroll js -->
        <script src="/resources/assets/vendor/slimscroll/jquery.slimscroll.js"></script>
        <!-- main js -->
        <script src="/resources/assets/libs/js/main-js.js"></script>
        <script>
    function printInvoice(a){
        var backup = document.body.innerHTML;
        var divContent = document.getElementById(a).innerHTML;
        document.body.innerHTML = divContent;
        window.print();
        document.body.innerHTML = backup;
    }
        
</script>
</body>
 
</html>