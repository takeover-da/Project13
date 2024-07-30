package stream;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Quzi2 {

	public static void main(String[] args) {

		Stream<File> fileStream = 
				Stream.of(new File("file1.txt"), new File("file2.pdf"), 
						new File("file3.txt"), new File("file4.img"), 
						new File("file5.txt"), new File("file6.img"));
		
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::print);
		
		
		
////		fileStream = Stream.of(File);
//		
//		fileStream.map(File::getName)
//		.map(s -> s.subString(s.indexof('.')+1))
//		.forEach(System.out::print);
//		System.out.println();
		
		
//		
//		List<String> list = Arrays.asList("file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img");
//		Stream<String> stream = list.stream();
//		
//		// 목록중에 'txt' 파일만 찾기!
//		list.stream()
//			.filter(t -> t =="txt")
//			.forEach(t -> System.out.println(t));
//		
//		//확장자 별로 파일 갯수 구하기!
//		list.stream()
//			.map(t -> t.codePointCount(, ));
//		long count = stream.count();
		
		
		
	}

}
