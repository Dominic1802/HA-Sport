<%@page contentType="text/html" pageEncoding="UTF-8"%>  
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="vn">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="icon" href="/static/img/favicon.png" type="image/png">
        <title>HA-Sport</title>
        <link rel="icon" type="image/png" href="images/icons/favicon.ico" />
        <!--===============================================================================================-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--===============================================================================================-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="./static/css/bootstrap.css">
        <link rel="stylesheet" href="./static/vendors/linericon/style.css">
        <link rel="stylesheet" href="./static/css/font-awesome.min.css">
        <link rel="stylesheet" href="./static/vendors/owl-carousel/owl.carousel.min.css">
        <link rel="stylesheet" href="./static/vendors/lightbox/simpleLightbox.css">
        <link rel="stylesheet" href="./static/vendors/nice-select/css/nice-select.css">
        <link rel="stylesheet" href="./static/vendors/animate-css/animate.css">
        <link rel="stylesheet" href="./static/vendors/jquery-ui/jquery-ui.css">
        <!-- main css -->
        <link rel="stylesheet" href="./static/css/style.css">
        <link rel="stylesheet" href="./static/css/responsive.css">
     
    </head>

    <body>
        <header>

            <nav class="navbar navbar-expand-sm bg-dark">
                <div class="container">
                    <a class="navbar-brand" href="home"><img style="width: 152px" src="./images/Capture.JPG"/> </a>
                    <ul class="navbar-nav navbar-right">
                        <li class="nav-item mx-3"><a class="nav-link" href="home">Home</a></li>
                        <li class="nav-item mx-3"><a class="nav-link" href="all-product">Shop</a></li>


                        <c:if test="${sessionScope.accountsession!=null}">
                            <li class="nav-item mx-3"><a class="nav-link" href="cart"><i class="fa fa-shopping-cart" aria-hidden="true"></i> Cart</a></li>
                            <li class="nav-item "><a class="nav-link" href="profile">Profile <span><i class="fa fa-user"></i></span></a></li> 
                            <li class="nav-item "><a class="nav-link" href="logout">Logout <span><i class="fa fa-sign-out"></i></span></a></li> 
                                    </c:if>

                        <c:if test="${sessionScope.accountsession eq null}">
                            <li class="nav-item mx-3"><a class="nav-link" href="signup">
                                    Sign Up <span><i class="fa fa-user-plus"></i></span></a></li>
                            <li class="nav-item mx-3"><a class="nav-link" href="login">
                                    Login <span><i class="fa fa-sign-out"></i></span></a></li>
                                    </c:if>

                    </ul>
                </div>
            </nav>
        </header>

        <!--================Home Banner Area =================-->
        <section class="home_banner_area" style="background: url(static/img/hinh_nen.jpeg)">
            <img alt=""/>
            <div class="overlay"></div>
            <div class="banner_inner d-flex align-items-center">
                <div class="container">
                    <div class="banner_content row">
                        <div class="offset-lg-2 col-lg-8">
                            <h3>Welcome to
                                <br />HA-Sport</h3>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna
                                aliqua. Ut enim ad minim veniam, quis nostrud exercitation.</p>
                            <a class="white_bg_btn" href="#">View Collection</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--================End Home Banner Area =================-->

        <!--================Hot Deals Area =================-->
        <section id="hot_deals" class="hot_deals_area section_gap">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-6">
                        <div class="hot_deal_box">
                            <img style="width: 750px; height: 286px" class="img-fluid" src="./images/cau-long.jpg" alt="">
                            <div class="content">
                                <h2>Variety of products</h2>
                                <p>Shop Now</p>
                            </div>
                            <a class="hot_deal_link" href="all-product"></a>
                        </div>
                    </div>

                    <div class="col-lg-6">
                        <div class="hot_deal_box">
                            <img style="width: 750px; height: 286px" class="img-fluid" src="./images/home2.jpg" alt="">
                            <div class="content">
                                <h2>Quality comes first</h2>
                                <p>Shop Now</p>
                            </div>
                            <a class="hot_deal_link" href="all-product"></a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--================End Hot Deals Area =================-->

        <!--================Clients Logo Area =================-->
        <section class="clients_logo_area">
            <div class="container-fluid">
                <div class="clients_slider owl-carousel">
                    <div class="item">
                        <a href="all-product?search=&category=6&beginp=&endp=&sort=1"><img  style=" width: 150px;" src="./static/img/Lining.png" alt=""></a> 
                    </div>
                    <div class="item">
                        <a href="all-product?search=&category=7&beginp=&endp=&sort=1"><img style=" width: 150px;" src="./static/img/yonex.jpg" alt=""></a>
                    </div>
                    <div class="item">
                        <a href="all-product?search=&category=8&beginp=&endp=&sort=1"><img style=" width: 150px;" src="./static/img/fleet.jpg" alt=""></a>
                    </div>
                    <div class="item">
                        <a href="all-product?search=&category=9&beginp=&endp=&sort=1"><img style=" width: 150px;" src="./static/img/victor.jpeg" alt=""></a>
                    </div>

                </div>
            </div>
        </section>
        <!--================End Clients Logo Area =================-->

        <!--================Feature Product Area =================-->
        <section class="feature_product_area section_gap">
            <div class="main_box">
                <div class="container-fluid">
                    <div class="row">
                        <div class="main_title">
                            <h2>Featured Products</h2>
                            <p>People who absolutely love the shop's products</p>
                        </div>
                    </div>
                    <div class="row">

                        <c:forEach items="${listProduct}" var = "item" begin="0" end="9">
                             <a href="product-detail?productid=${item.proId}">
                            <div class="col col1">
                               <input type="hidden" name="id" value="${product.proId}"/>
                                <div class="f_p_item">
                                    <div class="f_p_img">
                                        <a href="product-detail?productid=${item.proId}"> <img class="img-fluid" style="width: 300px; height: 230px" src="${item.proImg}" alt=""> </a>
                                        <div class="p_icon">
                                            <a href="product-detail?productid=${item.proId}"> 
                                                <i class="lnr lnr-cart"></i>
                                            </a>
                                        </div>
                                    </div>
                                    <a href="#">
                                        <a href="product-detail?productid=${item.proId}"> <h4>${item.proName}</h4></a>
                                    </a>
                                   <a href="product-detail?productid=${item.proId}"> <h5>$${item.proPrice}</h5></a>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </section>

        <%@include file="./Footer.jsp" %>
        
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="./static/js/jquery-3.2.1.min.js"></script>
        <script src="./static/js/popper.js"></script>
        <script src="./static/js/bootstrap.min.js"></script>
        <script src="./static/js/stellar.js"></script>
        <script src="./static/vendors/lightbox/simpleLightbox.min.js"></script>
        <script src="./static/vendors/nice-select/js/jquery.nice-select.min.js"></script>
        <script src="./static/vendors/isotope/imagesloaded.pkgd.min.js"></script>
        <script src="./static/vendors/isotope/isotope-min.js"></script>
        <script src="./static/vendors/owl-carousel/owl.carousel.min.js"></script>
        <script src="./static/js/jquery.ajaxchimp.min.js"></script>
        <script src="./static/vendors/counter-up/jquery.waypoints.min.js"></script>
        <script src="./static/vendors/flipclock/timer.js"></script>
        <script src="./static/vendors/counter-up/jquery.counterup.js"></script>
        <script src="./static/js/mail-script.js"></script>
        <script src="./static/js/theme.js"></script>
    </body>

</html>
