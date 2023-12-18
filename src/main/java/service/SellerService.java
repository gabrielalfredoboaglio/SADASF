package service;

import entity.Seller;

import java.util.List;

public interface SellerService {
    List<Seller> getAllSellers();
    Seller getSellerById(Long sellerId);
    void saveSeller(Seller seller);
    void updateSeller(Long sellerId, Seller updatedSeller);
    void deleteSeller(Long sellerId);
}

