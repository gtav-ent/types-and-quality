package carlosgsouza.vinylshop.controller

import carlosgsouza.vinylshop.database.DB
import carlosgsouza.vinylshop.model.Genre
import carlosgsouza.vinylshop.model.Vinyl

class GenreController {
	
	DB db = DB.connect()
	
	List<String> list() {
		db.genres
	}
	
	List<Genre> search(String genreName) {
		boolean itemExists = false
		
		if(!itemExists) {
			for(item in db.getGenres()) {
				if(item.toLowerCase().contains(genreName.toLowerCase())) {
					itemExists = true
					break
				}
			}
		}
		
		if(itemExists) {
			db.searchVinylByGenre(genreName)
		} else {
			return []
		}
		
	}
	
}