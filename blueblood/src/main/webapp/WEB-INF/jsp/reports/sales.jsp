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
        <link rel="stylesheet" href="/resources/assets/vendor/vector-map/jqvmap.css">
        <link rel="stylesheet" href="/resources/assets/vendor/jvectormap/jquery-jvectormap-2.0.2.css">
        <link rel="stylesheet" href="/resources/assets/vendor/fonts/flag-icon-css/flag-icon.min.css">
        <link rel="stylesheet" href="/resources/assets/vendor/bootstrap/css/bootstrap.min.css">
        <link href="/resources/assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
        <link rel="stylesheet" href="/resources/assets/libs/css/style.css">
        <link rel="stylesheet" href="/resources/assets/vendor/fonts/fontawesome/css/fontawesome-all.css">
        <link rel="stylesheet" type="text/css" href="/resources/assets/vendor/datatables/css/dataTables.bootstrap4.css">
        <link rel="stylesheet" type="text/css" href="/resources/assets/vendor/datatables/css/buttons.bootstrap4.css">
        <link rel="stylesheet" type="text/css" href="/resources/assets/vendor/datatables/css/select.bootstrap4.css">
        <link rel="stylesheet" type="text/css" href="/resources/assets/vendor/datatables/css/fixedHeader.bootstrap4.css">

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
                <div class="container-fluid  dashboard-content">
                    <!--Top Row-->
                    <div class="row">
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                            <div class="page-header">
                                <h3 class="mb-2">Sales Dashboard Template </h3>
                                <p class="pageheader-text">Lorem ipsum dolor sit ametllam fermentum ipsum eu porta consectetur adipiscing elit.Nullam vehicula nulla ut egestas rhoncus.</p>
                                <div class="page-breadcrumb">
                                    <nav aria-label="breadcrumb">
                                        <ol class="breadcrumb">
                                            <li class="breadcrumb-item"><a href="#" class="breadcrumb-link">Dashboard</a></li>
                                            <li class="breadcrumb-item active" aria-current="page">Sales Dashboard Template</li>
                                        </ol>
                                    </nav>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!--First row-->
                    <div class="row">
                        <!--total Customers-->
                        <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12 col-12">
                            <div class="card">
                                <div class="card-body">
                                    <h5 class="text-muted">Customers</h5>
                                    <div class="metric-value d-inline-block">
                                        <h1 class="mb-1 text-primary">${map.count}</h1>
                                    </div>
                                    <div class="metric-label d-inline-block float-right text-success">
                                        <i class="fa fa-fw fa-caret-up"></i><span>5.27%</span>
                                    </div>
                                </div>
                                <div id="sparkline-1"></div>
                            </div>
                        </div>
                        <!--Recent Orders-->
                        <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12 col-12">
                            <div class="card">
                                <div class="card-body">
                                    <h5 class="text-muted">Recent Order</h5>
                                    <div class="metric-value d-inline-block">
                                        <h1 class="mb-1 text-primary">${map.oCount}</h1>
                                    </div>
                                    <div class="metric-label d-inline-block float-right text-danger">
                                        <i class="fa fa-fw fa-caret-down"></i><span></span>
                                    </div>
                                </div>
                                <div id="sparkline-2"></div>
                            </div>
                        </div>
                        <!--Completed Orders-->
                        <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12 col-12">
                            <div class="card">
                                <div class="card-body">
                                    <h5 class="text-muted">Completed Orders</h5>
                                    <div class="metric-value d-inline-block">
                                        <h1 class="mb-1 text-primary">${map.dCount}</h1>
                                    </div>
                                    <div class="metric-label d-inline-block float-right text-danger">
                                        <i class="fa fa-fw fa-caret-down"></i><span></span>
                                    </div>
                                </div>
                                <div id="sparkline-3">
                                </div>
                            </div>
                        </div>
                        <!--Total Sales-->
                        <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12 col-12">
                            <div class="card">
                                <div class="card-body">
                                    <h5 class="text-muted">Total Sales</h5>
                                    <div class="metric-value d-inline-block">
                                        <h1 class="mb-1 text-primary"> ${map.totalSales} </h1>
                                    </div>
                                    <div class="metric-label d-inline-block float-right text-success">
                                        <i class="fa fa-fw fa-caret-up"></i><span>4.87%</span>
                                    </div>
                                </div>
                                <div id="sparkline-4"></div>
                            </div>
                        </div>
                    </div>
                    <!--End First Row-->
                    <!--Start Second row-->
                    <div class="row">
                        <div class="col-xl-8 col-lg-12 col-md-8 col-sm-12 col-12">
                            <div class="card">
                                <h5 class="card-header">Revenue</h5>
                                <div class="card-body">
                                    <canvas id="revenue" width="400" height="150"></canvas>
                                </div>
                                <div class="card-body border-top">
                                    <div class="row">
                                        <div class="offset-xl-1 col-xl-3 col-lg-3 col-md-12 col-sm-12 col-12 p-3">
                                           <h2 class="font-weight-normal mb-3"><span>${map.todaysSales}</span>                                                    </h2>
                                            <div class="mb-0 mt-3 legend-item">
                                                <span class="fa-xs text-primary mr-1 legend-title "><i class="fa fa-fw fa-square-full"></i></span>
                                                <span class="legend-text">Todays Sales</span></div>
                                        </div>
                                        <div class="offset-xl-1 col-xl-3 col-lg-3 col-md-6 col-sm-12 col-12 p-3">
                                            <h2 class="font-weight-normal mb-3"><span>${map.currentWeek}</span>                                                    </h2>
                                            <div class="mb-0 mt-3 legend-item">
                                                <span class="fa-xs text-primary mr-1 legend-title "><i class="fa fa-fw fa-square-full"></i></span>
                                                <span class="legend-text">Current Week</span></div>
                                        </div>
                                        <div class="offset-xl-1 col-xl-3 col-lg-3 col-md-6 col-sm-12 col-12 p-3">
                                            <h2 class="font-weight-normal mb-3">

                                                <span>${map.previousWeek}</span>
                                            </h2>
                                            <div class="text-muted mb-0 mt-3 legend-item"> <span class="fa-xs text-secondary mr-1 legend-title"><i class="fa fa-fw fa-square-full"></i></span><span class="legend-text">Previous Week</span></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-xl-4 col-lg-12 col-md-4 col-sm-12 col-12">
                            <div class="card">
                                <h5 class="card-header">Total Sale</h5>
                                <div class="card-body">
                                    <canvas id="total-sale" width="220" height="155"></canvas>
                                    <div class="chart-widget-list">
                                        <p>
                                            <span class="fa-xs text-primary mr-1 legend-title"><i class="fa fa-fw fa-square-full"></i></span><span class="legend-text">Todays</span>
                                            <span class="float-right">${map.todaysSales}</span>
                                        </p>
                                        <p>
                                            <span class="fa-xs text-secondary mr-1 legend-title"><i class="fa fa-fw fa-square-full"></i></span>
                                            <span class="legend-text">This Week</span>
                                            <span class="float-right">${map.currentWeek}</span>
                                        </p>
                                        <p>
                                            <span class="fa-xs text-brand mr-1 legend-title"><i class="fa fa-fw fa-square-full"></i></span> <span class="legend-text">This Month</span>
                                            <span class="float-right">${map.currentMonth}</span>
                                        </p>
                                        <p class="mb-0">
                                            <span class="fa-xs text-info mr-1 legend-title"><i class="fa fa-fw fa-square-full"></i></span> <span class="legend-text">This Year</span>
                                            <span class="float-right">${map.currentyear}</span>
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>

                    <!-- end 2nd Row  -->
                    <!--Start 3rd Row for Today-->
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <h1 class="card-header text-center">Todays Sales Report</h1>
                                <div class="card-body p-0">
                                    <div class="table-responsive">
                                        <table id="example" class="table table-striped table-bordered second" style="width:100%">
                                            <thead>
                                                <tr>
                                                    <th>Product Name</th>
                                                    <th>Price</th>
                                                    <th>Quantity</th>
                                                    <th>Total Amount</th>
                                                    <th>Customer</th>
                                                    <th>Order No</th>
                                                    <th>Month</th>
                                                    <th>Year</th>

                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach var="q" items="${map.dList}">
                                                    <tr>
                                                        <td>${q.pName}</td>
                                                        <td>${q.pPrice}</td>
                                                        <td>${q.qty}</td>
                                                        <td>${q.total}</td>
                                                        <td>${q.customer}</td>
                                                        <td>${q.orderNo}</td>
                                                        <td>${q.months}</td>
                                                        <td>${q.years}</td>
                                                    </tr>
                                                </c:forEach>

                                            </tbody>
                                            <tfoot>
                                                <tr>

                                                </tr>
                                            </tfoot>
                                        </table>
                                    </div>
                                </div>

                            </div>
                        </div>  
                    </div>
                    <!--End 3rd row for Today-->
                    <!--start fourth Row for Week -->
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <h1 class="card-header text-center">Sales Report Of This Week</h1>
                                <div class="card-body p-0">
                                    <div class="table-responsive">
                                        <table id="example" class="table table-striped table-bordered second" style="width:100%">
                                            <thead>
                                                <tr>
                                                    <th>Product Name</th>
                                                    <th>Price</th>
                                                    <th>Quantity</th>
                                                    <th>Total Amount</th>
                                                    <th>Customer</th>
                                                    <th>Order No</th>
                                                    <th>Month</th>
                                                    <th>Year</th>

                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach var="q" items="${map.wList}">
                                                    <tr>
                                                        <td>${q.pName}</td>
                                                        <td>${q.pPrice}</td>
                                                        <td>${q.qty}</td>
                                                        <td>${q.total}</td>
                                                        <td>${q.customer}</td>
                                                        <td>${q.orderNo}</td>
                                                        <td>${q.months}</td>
                                                        <td>${q.years}</td>
                                                    </tr>
                                                </c:forEach>

                                            </tbody>
                                            <tfoot>
                                                <tr>

                                                </tr>
                                            </tfoot>
                                        </table>
                                    </div>
                                </div>

                            </div>
                        </div>  
                    </div>
                    <!--End fourth Row for week-->
                    <!--start Fifth Row for Month-->
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <h1 class="card-header text-center">Sales Report Of This Month</h1>
                                <div class="card-body p-0">
                                    <div class="table-responsive">
                                        <table id="example" class="table table-striped table-bordered second" style="width:100%">
                                            <thead>
                                                <tr>
                                                    <th>Product Name</th>
                                                    <th>Price</th>
                                                    <th>Quantity</th>
                                                    <th>Total Amount</th>
                                                    <th>Customer</th>
                                                    <th>Order No</th>
                                                    <th>Month</th>
                                                    <th>Year</th>

                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach var="q" items="${map.mList}">
                                                    <tr>
                                                        <td>${q.pName}</td>
                                                        <td>${q.pPrice}</td>
                                                        <td>${q.qty}</td>
                                                        <td>${q.total}</td>
                                                        <td>${q.customer}</td>
                                                        <td>${q.orderNo}</td>
                                                        <td>${q.months}</td>
                                                        <td>${q.years}</td>
                                                    </tr>
                                                </c:forEach>

                                            </tbody>
                                            <tfoot>
                                                <tr>

                                                </tr>
                                            </tfoot>
                                        </table>
                                    </div>
                                </div>

                            </div>
                        </div>  
                    </div>
                    <!--End Fifth row for Month-->
                    <!--start sixth Row For Year-->
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <h1 class="card-header text-center">Sales Report Of The Year</h1>
                                <div class="card-body p-0">
                                    <div class="table-responsive">
                                        <table id="example" class="table table-striped table-bordered second" style="width:100%">
                                            <thead>
                                                <tr>
                                                    <th>Product Name</th>
                                                    <th>Price</th>
                                                    <th>Quantity</th>
                                                    <th>Total Amount</th>
                                                    <th>Customer</th>
                                                    <th>Order No</th>
                                                    <th>Month</th>
                                                    <th>Year</th>

                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach var="q" items="${map.yList}">
                                                    <tr>
                                                        <td>${q.pName}</td>
                                                        <td>${q.pPrice}</td>
                                                        <td>${q.qty}</td>
                                                        <td>${q.total}</td>
                                                        <td>${q.customer}</td>
                                                        <td>${q.orderNo}</td>
                                                        <td>${q.months}</td>
                                                        <td>${q.years}</td>
                                                    </tr>
                                                </c:forEach>

                                            </tbody>
                                            <tfoot>
                                                <tr>

                                                </tr>
                                            </tfoot>
                                        </table>
                                    </div>
                                </div>

                            </div>
                        </div>  
                    </div>
                    <!--End sixth row-->
                    <!--start Fourth Row for table-->
                    <div class="row">
                        <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12 col-12 pl-4">
                            <div class="card">
                                <h5 class="card-header text-center"> Top Selling products by Quantity</h5>
                                <div class="card-body p-0">
                                    <li class="traffic-sales-content list-group-item "><span><b>Product Name</b></span><span class="traffic-sales-amount"><b>Total Quantity</b><span ></span><span class="ml-1 text-success"></span></span>
                                    </li>
                                    <ul class="social-sales list-group list-group-flush">
                                        <c:forEach var="q" items="${map.qList}">
                                            <li class="traffic-sales-content list-group-item "><span class="traffic-sales-name">${q.pName}</span><span class="traffic-sales-amount">${q.sQty}<span class="icon-circle-small icon-box-xs text-success ml-4 bg-success-light"></span>
                                            </li>
                                        </c:forEach>
                                    </ul>
                                </div>
                                
                            </div>
                        </div>
                        <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12 col-12">
                            <div class="card">
                                <h5 class="card-header text-center">Top selling product by Value</h5>
                                <div class="card-body p-0">
                                    <ul class="traffic-sales list-group list-group-flush">
                                        <li class="traffic-sales-content list-group-item "><span><b>Product Name</b></span><span class="traffic-sales-amount"><b>Sales Amount</b><span ></span><span class="ml-1 text-success"></span></span>
                                        </li>
                                        <ul class="social-sales list-group list-group-flush">
                                            <c:forEach var="v" items="${map.vList}">
                                                <li class="traffic-sales-content list-group-item "><span class="traffic-sales-name">${v.pName}</span><span class="traffic-sales-amount">${v.totalSales}<span class="icon-circle-small icon-box-xs text-success ml-4 bg-success-light"></span>
                                                </li>

                                            </c:forEach>
                                        </ul>
                                </div>
                                
                            </div>
                        </div>

                        <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12 col-12">
                            <div class="card">
                                <h5 class="card-header text-center">Top selling product by Profit</h5>
                                <div class="card-body p-0">
                                    <ul class="traffic-sales list-group list-group-flush">
                                        <li class="traffic-sales-content list-group-item "><span><b>Product Name</b></span><span class="traffic-sales-amount"><b>Total Profit</b><span ></span><span class="ml-1 text-success"></span></span>
                                        </li>
                                        <ul class="social-sales list-group list-group-flush">
                                            <c:forEach var="v" items="${map.pList}">
                                                <li class="traffic-sales-content list-group-item "><span class="traffic-sales-name">${v.pName}</span><span class="traffic-sales-amount">${v.profit}<span class="icon-circle-small icon-box-xs text-success ml-4 bg-success-light"></span>
                                                </li>

                                            </c:forEach>
                                        </ul>
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
        <script>
            $(document).ready(function () {
                $('#myTable').DataTable();
            });
        </script>



        <!--For data tables-->
        <script src="/resources/assets/vendor/jquery/jquery-3.3.1.min.js"></script>
        <script src="/resources/assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
        <script src="/resources/assets/vendor/slimscroll/jquery.slimscroll.js"></script>
        <script src="/resources/assets/vendor/multi-select/js/jquery.multi-select.js"></script>
        <script src="/resources/assets/libs/js/main-js.js"></script>
        <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
        <script src="/resources/assets/vendor/datatables/js/dataTables.bootstrap4.min.js"></script>
        <script src="https://cdn.datatables.net/buttons/1.5.2/js/dataTables.buttons.min.js"></script>
        <script src="/resources/assets/vendor/datatables/js/buttons.bootstrap4.min.js"></script>
        <script src="/resources/assets/vendor/datatables/js/data-table.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js"></script>
        <script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.html5.min.js"></script>
        <script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.print.min.js"></script>
        <script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.colVis.min.js"></script>
        <script src="https://cdn.datatables.net/rowgroup/1.0.4/js/dataTables.rowGroup.min.js"></script>
        <script src="https://cdn.datatables.net/select/1.2.7/js/dataTables.select.min.js"></script>
        <script src="https://cdn.datatables.net/fixedheader/3.1.5/js/dataTables.fixedHeader.min.js"></script>
        <!-- bootstrap bundle js-->
        <script src="/resources/assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
        <!-- slimscroll js-->
        <script src="/resources/assets/vendor/slimscroll/jquery.slimscroll.js"></script>
        <!-- chartjs js-->
        <script src="/resources/assets/vendor/charts/charts-bundle/Chart.bundle.js"></script>
        <script src="/resources/assets/vendor/charts/charts-bundle/chartjs.js"></script>

        <!-- main js-->
        <script src="/resources/assets/libs/js/main-js.js"></script>
        <!-- jvactormap js-->
        <script src="/resources/assets/vendor/jvectormap/jquery-jvectormap-2.0.2.min.js"></script>
        <script src="/resources/assets/vendor/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
        <!-- sparkline js-->
        <script src="/resources/assets/vendor/charts/sparkline/jquery.sparkline.js"></script>
        <script src="/resources/assets/vendor/charts/sparkline/spark-js.js"></script>
        <!-- dashboard sales js-->
        <script src="/resources/assets/libs/js/dashboard-sales.js"></script>
    </body>


</html>