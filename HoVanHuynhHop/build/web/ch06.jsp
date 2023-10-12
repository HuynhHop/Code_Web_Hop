
<!DOCTYPE html>
<html>
<head>
        <meta charset="UTF-8">
        <title>Murach's Java Servlets and JSP</title>
        <link rel="stylesheet" href="styles/survey.css">
    </head>
    <body>
        <img src="images/hello.jpg" alt="logo" />
        <h1>Survey</h1>
        <p>If you have a moment, we'd appreciate it if you would fill out this survey.</p>
        <h2>Your information:</h2>
         <form action="ch0602" method="post">
             <input type="hidden" name="action" value="add">
            
            <label>First Name</label>
            <input type="text" name="firstName" required"><br>
            <label>Last Name</label>
            <input type="text" name="lastName" required"><br>
            <label>Email</label>
            <input type="email" name="email" required"><br>
            <label>Date of Birth</label>
            <input type="text" name="DoB" required"> <br>

            <h2>How did you hear about us?</h2>
            <p><input type=radio name="heardFrom" value="Social Media" checked>Social Media
                <input type=radio name="heardFrom" value="Search Engine">Search engine
               <input type=radio name="heardFrom" value="Word of mouth">Word of mouth
               <input type=radio name="heardFrom" value="Other">Other</p>

            <h2>Would you like to receive announcements about new CDs and special offers?</h2>
            <p><input type="checkbox" name="wantsUpdates" value="YES, I'd like that" checked>YES, I'd like that.</p>

            <p><input type="checkbox" name="wantsUpdates" value="YES, please send me email announcements">YES, please send me email announcements.</p>
            

            <p>Please contact me by:
                <select name="contactVia">
                    <option value="Emial or postal Mail" selected>Email or postal mail</option>
                    <option value="Email">Email only</option>
                    <option value="Postal Mail">Postal mail only</option>
                </select>
            </p>

        <input type="submit" value="Join Now" class="margin_left">
        </form>
        <a href="index.html">
            <button type="button"> Back to Home</button>
        </a>            
    </body>
</html>
