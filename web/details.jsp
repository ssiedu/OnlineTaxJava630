<html>
    <body>
        <h3>Details-Submission-Form</h3>
        <hr>
        <form action="TaxCalculator" method="get">
            <pre>
            YourPic <input type="file" name="f1"/>
            Income  <input type="text" name="t1"/>
            Age     <input type="text" name="t2"/>
            NRI     <input type="checkbox" name="c1" value="yes"/>
            Source  :   Service     <input type="radio" name="r1" value="service" checked="checked"/>
                        Business    <input type="radio" name="r1" value="business"/>
            Assets  <select name="assets" multiple="multiple">
                        <option>car</option>
                        <option>flat</option>
                        <option>plot</option>
                        <option>gold</option>
                        <option>diamond</option>
                        <option>shares</option>
                    </select>
                    
                    <input type="submit" value="Find-Tax"/>
            </pre>
        </form>
        <hr>
        <a href="index.jsp">Home</a>
    </body>
</html>
