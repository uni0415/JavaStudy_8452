const search = document.querySelector(".search-container");
const search_box = document.querySelector(".search-box");
const search_input = document.querySelector("#search-in");
const img = search_box.querySelector("img");
let deleteImg;

search.onclick = () => {
    if (search_input.value.length == 0) {
        search_box.removeChild(img);
    }
    if (search_input.focus()) {
        if (search_input.value.length != 0) {
            search_box.removeChild(label);
            
        }
        
    }
    else {
        
    }
}
