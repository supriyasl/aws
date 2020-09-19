package s3;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class ReadS3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bucket_name="supriya2";
		String key_name="us3.txt";
		final AmazonS3 s3=AmazonS3ClientBuilder.defaultClient();
		//S3Object object=s3.getObject(new GetObjectRequest(bucket_name,key_name));
	//	InputStream objectData=
	}

}
