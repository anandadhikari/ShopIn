package com.shop.in.service.products;

import com.shop.in.customexception.custom.GlobalServerException;
import com.shop.in.customexception.custom.InvalidRequest;
import com.shop.in.customexception.custom.ProductNotFound;
import com.shop.in.dtos.*;
import com.shop.in.entity.Advertisement;
import com.shop.in.entity.Products;
import com.shop.in.entity.UsersReview;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ProductServices {

    ResponseEntity<?> addProducts(Products products);

    ResponseEntity<?> submitProductReview(int productId, UsersReview usersReview) throws ProductNotFound;

    ResponseEntity<?> addThumbnail(int productId, MultipartFile file) throws ProductNotFound, IOException;

    ResponseEntity<?> addProductImages(int productId, MultipartFile[] files) throws ProductNotFound, IOException;

    double overallRatingCalc(Products products, int newRating);

    List<View> handleNewDeals();

    Product getProductById(int id, String userId) throws ProductNotFound, InvalidRequest;

    AllProductDisplay getProductView(int page, int size);

    ResponseEntity<?> handleProductDetailsUpdate(int id, String title, String price, int stock);

    ResponseEntity<?> handleProductStockUpdate(int id, int stock);

    ResponseEntity<?> handleProductTrending(int id, boolean trend);

    int handleGetAllproducts();

    ResponseEntity<?> addAdvertisement(int productId, MultipartFile multipartFile) throws IOException;

    List<AdProductView> searchProduct(String name);

    List<Advertisement> getAdvertisement();

    ResponseEntity<String> deleteAdvertisement(int id);

    long handleAdCount();

    SearchPage productSearch(String query, int limit, int page, double price, double rating, boolean outOfStock, boolean topDeals) throws GlobalServerException;

    AllProductDisplay handleProductSearch(int page, int size, String query);

    List<Advertisement> displayAd();

    public Advertisement displaySpecificAd();

    public List<View> getCategoryBasedProducts(int id);

    public List<View> getBestSellers();

}
