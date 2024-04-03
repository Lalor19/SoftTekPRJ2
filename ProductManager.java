public interface ProductManager {
    public Product createProduct();
    public Product updateProduct(int productID);
    public Product deactivateProduct(int productID);
    public Product getProduct(int productID);
    public Product getProductHistory(int productID);
    public Product attachPhotoToProduct();
}
