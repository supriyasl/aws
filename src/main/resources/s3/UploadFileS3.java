package s3;

import java.io.File;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class UploadFileS3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final AmazonS3 s3=AmazonS3ClientBuilder.defaultClient();
		String bucket_name="supriya2";
		String key_name="us3.txt";
		String file_path="C://AWS//practise//Supriya//abc.txt";
		try {
			s3.putObject(bucket_name,key_name,new File(file_path));
		}
		catch(AmazonServiceException e)
		{
			System.err.println(e.getErrorMessage());
			System.exit(1);
		}
	}

}
