<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <form id="data" name="data" action="signIn" method="post">
            <table>
                <tr>
                    <td><label>Login</label></td>
                    <td><input type="text" id="username" name="username"></td>
                </tr>
                <tr>
                    <td><label>Password</label></td>
                    <td><input type="password" id="password" name="password"></td>
                </tr>
                <% if (request.getParameter ("err") != null &&
                       request.getParameter ("err").equals("100")) { %>

                <tr>
                    <td colspan="2"><label>USER AND PASSWORD INVALID !!!</label></td>
                </tr>

                <%}%>
                <tr>
                    <td><input type="submit"></td>
                    <td><input type="reset"></td>
                </tr>
            </table>
        </form>
    </body>
</html>