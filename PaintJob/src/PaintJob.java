public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double countBucket = 0;
            double area = width * height;
            countBucket = area / areaPerBucket;
            double neededBucket = countBucket - (double)extraBuckets;
            return (int) Math.ceil(neededBucket);
        }

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double countBucket = 0;
            double area = width * height;
            countBucket = area / areaPerBucket;
            return (int) Math.ceil(countBucket);
        }

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double countBucket = 0;
            countBucket = area / areaPerBucket;
            return (int) Math.ceil(countBucket);
        }
    }
}
