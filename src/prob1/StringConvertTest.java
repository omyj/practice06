package prob1;

public class StringConvertTest {

	public static void main(String[] args) {
		String strData1 = "200";
		int intData2 = 150;
		
		/* 코드를 완성합니다. */
		int intData1 = Integer.parseInt( strData1 );
		String strData2 = String.valueOf( intData2 );
		
		System.out.println( "결과:" + intData1 + "," + strData2 );
	}

}
