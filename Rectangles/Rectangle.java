// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Rectangle {

    double length;
    double width;
    double xaxis;

    double yaxis;

    public void setXaxis(double xaxis) {
        this.xaxis = xaxis;
    }

    public void setYaxis(double yaxis) {
        this.yaxis = yaxis;
    }

    public double getXaxis() {
        return xaxis;
    }

    public double getYaxis() {
        return yaxis;
    }

    public void setlength(double length) {
        this.length = length;
    }

    public void setwidth(double width) {
        this.width = width;
    }

    public double getlength() {
        return length;
    }

    public double getwidth() {
        return width;
    }

    Rectangle(double length, double width, double xaxis, double yaxis) {
        setlength(length);
        setwidth(width);
        setXaxis(xaxis);
        setYaxis(yaxis);
    }

    public double FindArea() {
        return width * length;
    }

    public double Findcircumference() {
        return 2 * (length + width);
    }

    public Rectangle getMinrec(Rectangle R1, Rectangle R2) {
        if (R1.FindArea() > R2.FindArea()) {
            return R2;
        } else {
            return R1;
        }
    }
        public boolean isOverlapping(Rectangle other) {

            boolean xOverlap = (this.xaxis <= other.xaxis + other.width) && (this.xaxis + this.width >= other.xaxis);
            boolean yOverlap = (this.yaxis <= other.yaxis + other.length) && (this.yaxis + this.length >= other.yaxis
            return xOverlap && yOverlap;
        }

    }




