package encapsulation.p01ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        } else {
            this.length = length;
        }

    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        } else {
            this.width = width;
        }
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        } else {

            this.height = height;
        }
    }

    public double calculateSurfaceArea(double length, double width, double height) {

        return 2 * this.length * this.width + 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double calculateLateralSurfaceArea(double length, double width, double height) {

        return 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double calculateVolume(double length, double width, double height) {
        return this.length * this.width * this.height;
    }
}
