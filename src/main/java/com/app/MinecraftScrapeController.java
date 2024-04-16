package com.app;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class MinecraftScrapeController {

    @GetMapping("/{itemName}")
    public String getitem(@PathVariable String itemName) throws IOException {
        String url = "https://minecraft.wiki/w/" + itemName;
        Document doc = Jsoup.connect(url).get();
        return doc.title();
    }
}
