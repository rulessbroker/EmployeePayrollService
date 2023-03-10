import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.bridgelabz.FilesUtils;

class NIOFileAPITest {

	private static String HOME = System.getProperty("user.home");
	private static String PLAY_WITH_NOI = "TempPlayGround";

	@Test
	public void givenPath_WhenChecked_ThenConfirmed() throws IOException {
		// Check file exists
		Path homePath = Paths.get(HOME);
		Assertions.assertTrue(Files.exists(homePath));

		// Delete File and check File not exists
		Path playPath = Paths.get(HOME + "/" + PLAY_WITH_NOI);
		if (Files.exists(playPath))
			FilesUtils.deleteFiles(playPath.toFile());
		Assertions.assertTrue(Files.notExists(playPath));

		// Create Directory
		Files.createDirectories(playPath);
		Assertions.assertTrue(Files.exists(playPath));

		// Create File
		IntStream.range(1, 10).forEach(cntr -> {
			Path tempFile = Paths.get(playPath + "/temp" + cntr);
			Assertions.assertTrue(Files.notExists(tempFile));
			try {
				Files.createFile(tempFile);
			} catch (IOException e) {
				System.out.println("Error is" + e);
			}
			Assertions.assertTrue(Files.exists(tempFile));
		});

		// List Files,Directories as well as Files with Extension
		Files.list(playPath).filter(Files::isRegularFile).forEach(System.out::println);
		Files.newDirectoryStream(playPath).forEach(System.out::println);
		Files.newDirectoryStream(playPath, path -> path.toFile().isFile() && path.toString().startsWith("temp"))
				.forEach(System.out::println);
	}

}
