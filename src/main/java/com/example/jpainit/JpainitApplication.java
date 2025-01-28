package com.example.jpainit;

import com.example.jpainit.entities.composite_key.*;
import com.example.jpainit.entities.elem_collection.ElemContainer;
import com.example.jpainit.entities.elem_collection.ElemContainerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
public class JpainitApplication {


	private final ItemRepository itemRepository;
	private final StorageRepository storageRepository;
	private final StockRepository stockRepository;

	public JpainitApplication(ItemRepository itemRepository, StorageRepository storageRepository, StockRepository stockRepository) {
		this.itemRepository = itemRepository;
		this.storageRepository = storageRepository;
		this.stockRepository = stockRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(JpainitApplication.class, args);
	}

	// Sera vu durant le cours Spring Web
	@EventListener
	public void onStartup(ApplicationStartedEvent event) {
		Item pc = itemRepository.save(new Item("PC"));
		Storage nice = storageRepository.save(new Storage("Nice"));
		stockRepository.save(new Stock(new StockId(pc, nice), 50));
		stockRepository.save(new Stock(new StockId(pc, nice), 250));
	}

}
