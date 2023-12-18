package service;

import entity.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAllBrands();
    Brand getBrandById(Long brandId);
    void saveBrand(Brand brand);
    void updateBrand(Long brandId, Brand updatedBrand);
    void deleteBrand(Long brandId);
}

