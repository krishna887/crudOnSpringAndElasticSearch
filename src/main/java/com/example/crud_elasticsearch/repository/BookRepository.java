package com.example.crud_elasticsearch.repository;

import com.example.crud_elasticsearch.model.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BookRepository extends ElasticsearchRepository<Book, String> {
}