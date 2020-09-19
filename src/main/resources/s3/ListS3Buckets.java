package s3;



import java.util.List;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

public class ListS3Buckets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final AmazonS3 s3=AmazonS3ClientBuilder.defaultClient();
		List<Bucket>buckets=s3.listBuckets();
		System.out.println("Your amazon S3 buckets are :");
		for(Bucket b: buckets)
		{
			System.out.println(""+b.getName());
		}
	}

}
