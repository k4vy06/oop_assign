interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

// ImageProcessor class
class ImageProcessor implements Filterable {
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to image.");
    }

    public void reset_filter() {
        System.out.println("Image filter reset.");
    }
}

// DataAnalyzer class
class DataAnalyzer implements Filterable {
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to data.");
    }

    public void reset_filter() {
        System.out.println("Data filter reset.");
    }
}

public class Main {
    public static void main(String[] args) {
        ImageProcessor img = new ImageProcessor();
        DataAnalyzer data = new DataAnalyzer();

        img.apply_filter("Blur");
        img.reset_filter();

        data.apply_filter("Low Pass");
        data.reset_filter();
    }
}
