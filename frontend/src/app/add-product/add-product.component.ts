import { Component, OnInit } from '@angular/core';
import { FormGroup } from "@angular/forms";
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.scss']
})
export class AddProductComponent implements OnInit {

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
  }

  submitProduct(form:FormGroup) {
    //console.log(form.value);

    let url = "http://localhost:8087/product"
    let product = {
      "id": 0,
      "name": form.value.name,
      "price": form.value.price * 100,
      "stock": form.value.stock
    }

    let sub = (this.http.post(url, product)).subscribe (
      e => {
          //console.log(e);
          if (e == null) {
            alert("Error")
            return;
          }
          alert("Successfully Added");
          form.reset();
      }
      );
  }

}
