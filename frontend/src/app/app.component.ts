import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'Product Demo';

  constructor(private router:Router) { }
  
  
  viewProducts() {
    this.router.navigate(["view-products"]);
  }

  createProduct() {
    this.router.navigate(["add-product"]);
  }
}

