public class GifReaderFactory extends ImageReaderFactory {
    public ImageReader CreateImgReader() {
        return new GifReader();
    }

}
