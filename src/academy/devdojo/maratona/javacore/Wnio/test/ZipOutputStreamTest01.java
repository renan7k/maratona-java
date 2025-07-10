package academy.devdojo.maratona.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//zipar pastas, arquivos
public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip"); //arquivo gerado
        Path arquivosParaZipar = Paths.get("pasta/subpasta1/subsubpasta1"); //localização
        zip(arquivoZip, arquivosParaZipar);
    }
    private static void zip(Path arquivoZip, Path arquivosParaZipar){
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)){
            for(Path file : directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream); //copiando o conteúdo dos arquivos
                zipStream.closeEntry();
            }
            System.out.println("Arquivo criado com sucesso.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
