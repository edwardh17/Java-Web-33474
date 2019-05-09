<!doctype html>
<html lang="en">

<%@ include file="/WEB-INF/pages/header.jsp" %>

<body>

<%@ include file="/WEB-INF/pages/menu.jsp" %>

<!--================ Init Login Area =================-->
<section class="contact_area section_gap">
    <div class="container">
        <div class="row">
            <div class="col-lg-3">
                <div class="contact_info">
                    <div class="info_item">
                        <h6>User name</h6>
                        <p>Insert your email</p>
                    </div>
                    <div class="info_item">
                        <h6>Password</h6>
                        <p>Insert you secret password</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-9">
                <form class="row contact_form" action="signIn" method="post" id="data" novalidate="novalidate">
                    <div class="col-md-6">
                        <div class="form-group">
                            <input type="text" class="form-control" id="username" name="username" placeholder="Enter your user name">
                        </div>
                        <div class="form-group">
                            <input type="email" class="form-control" id="password" name="password" placeholder="Enter password">
                        </div>
                        <button type="submit" value="submit" class="primary_btn">
                            <span>Enter</span>
                        </button>
                    </div>
                </form>
            </div>
        </div>

    </div>
</section>
<!--================ End Login Area =================-->

<%@ include file="/WEB-INF/pages/footer.jsp" %>

</body>

</html>