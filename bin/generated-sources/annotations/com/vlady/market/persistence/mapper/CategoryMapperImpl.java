package com.vlady.market.persistence.mapper;

import com.vlady.market.domain.Category;
import com.vlady.market.persistence.entity.Categoria;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-23T20:24:38-0300",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category toCategory(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        Category category = new Category();

        if ( categoria.getEstado() != null ) {
            category.setActive( categoria.getEstado() );
        }
        category.setCategory( categoria.getDescripcion() );
        if ( categoria.getIdCategoria() != null ) {
            category.setCategoryId( categoria.getIdCategoria() );
        }

        return category;
    }

    @Override
    public Categoria toCategoria(Category category) {
        if ( category == null ) {
            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setDescripcion( category.getCategory() );
        categoria.setEstado( category.isActive() );
        categoria.setIdCategoria( category.getCategoryId() );

        return categoria;
    }
}
