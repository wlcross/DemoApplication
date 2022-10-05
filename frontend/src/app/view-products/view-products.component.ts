import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

interface Product {
  name: string,
  price: number,
  stock: number
};

@Component({
  selector: 'app-view-products',
  templateUrl: './view-products.component.html',
  styleUrls: ['./view-products.component.scss']
})
export class ViewProductsComponent implements OnInit {

  constructor(private http:HttpClient) { }

  

  public products : Array<Product> = [];
  

  ngOnInit(): void {

    let url = "http://localhost:8087/product"

    let sub = (this.http.get(url)).subscribe (
      e => {
          console.log(e); 
          this.products = JSON.parse(JSON.stringify(e));
          console.log(this.products);
      }
      );

  }

}
