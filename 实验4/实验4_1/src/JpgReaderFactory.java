public class JpgReaderFactory extends ImageReaderFactory {
    public ImageReader CreateImgReader() {
        return new JpgReader();
    }
}
