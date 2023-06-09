<%-- 
    Document   : Information
    Created on : Mar 16, 2022, 10:13:57 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>HA Shop</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->
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

    </head>
    <body>
        <div class="container-login100">
            <div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
                <form class="login100-form validate-form" action="pay" method="post">
                    <h1> Information</h1>

                    <div class="wrap-input100 validate-input" data-validate="Name is required">
                        <span class="label-input100">Full Name</span>
                        <input class="input100" type="text" placeholder="Please Enter Name" name="fullName" />
                        <span class="focus-input100" data-symbol="&#xf206;"></span>
                    </div>
                    <br/>

                    <div class="wrap-input100 validate-input" data-validate="Name is required">
                        <span class="label-input100">Phone Number</span>
                        <input class="input100" type="text" placeholder="Please Enter Phone Number" name="phone" />
                        <span class="focus-input100" data-symbol="&#xf206;"></span>
                    </div>
                    <br/>



                    <div class="wrap-input100 validate-input" data-validate="Name is required">
                        <span class="label-input100">Email</span>
                        <input class="input100" type="text" placeholder="Please Enter Email" name="email" />
                        <span class="focus-input100" data-symbol="&#xf206;"></span>
                    </div>
                    <br/>
                    <div class="wrap-input100 validate-input" data-validate="Name is required">
                        <span class="label-input100">Address</span>
                        <input class="input100" type="text" placeholder="Please Enter Address" name="address"/>
                        <span class="focus-input100" data-symbol="&#xf206;"></span>
                    </div>
                    <br/>


                    <button style="background-color: red; width: 90px;height: 30px; color: white; border-radius: 10px; margin-left: 37%">PayMent</button>


                </form>
            </div>
        </div>
        <%@include file="./Footer.jsp" %>
        <!--===============================================================================================-->
        <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/animsition/js/animsition.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/bootstrap/js/popper.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/select2/select2.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/daterangepicker/moment.min.js"></script>
        <script src="vendor/daterangepicker/daterangepicker.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/countdowntime/countdowntime.js"></script>
        <!--===============================================================================================-->
        <script src="js/main.js"></script>
    </body>
</html>
