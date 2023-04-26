<%-- 
    Document   : Update-Category
    Created on : Mar 12, 2022, 8:33:38 PM
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
        <jsp:useBean id="catDAO" class="dal.CategoryDAO" ></jsp:useBean>
        <jsp:useBean id="proDAO" class="dal.ProductDAO" ></jsp:useBean>
            <div class="container-login100">
                <div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
                    <form class="login100-form validate-form" action="update-category" method="post">
                        <h1> Update Category </h1>
                        <input type="hidden" name="catId" value="${category.catId}">
                    <div class="wrap-input100 validate-input" data-validate="Name is required">
                        <span class="label-input100">Category Name</span>
                        <input class="input100" type="text" placeholder="Type Product name" name="catname" value="${category.catName}"/>
                        <span class="focus-input100" data-symbol="&#xf206;"></span>
                    </div>
                    <br/>
                    <div class="wrap-input100 validate-input" data-validate="Name is required">
                        <span class="label-input100">Category Description</span>
                        <input class="input100" type="text" placeholder="Type Product Description" name="catdes" value="${category.catDes}"/>
                        <span class="focus-input100" data-symbol="&#xf206;"></span>
                    </div>
                    <br/>
                    <div class="container-login100-form-btn">
                        <div class="wrap-login100-form-btn">
                            <div class="login100-form-bgbtn"></div>
                            <button class="login100-form-btn" formaction="update-category" formmethod="POST">
                                Change
                            </button>
                        </div>
                    </div>

                </form>
            </div>
        </div>


    </body>
</html>
