package ma.sdia;

public class App1 {
    public static void main(String[] args) {
        SparkConf conf=new SparkConf().setAppName("Spark Docker").setMaster("spark://localhost:7077");
        JavaSparkContext sc=new JavaSparkContext(conf);
        JavaRDD<Integer>rdd1=sc.parallelize(Arrays.asList(12,6,8,9,10));
        rdd1.collect().forEach(System.out::println);
    }

}