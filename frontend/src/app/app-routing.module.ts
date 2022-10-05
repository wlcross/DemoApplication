import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ViewProductsComponent } from './view-products/view-products.component';
import { AddProductComponent } from './add-product/add-product.component';

const routes: Routes = [
  {path: '', redirectTo: 'view-products', pathMatch: 'full'},
  {path: 'view-products', component: ViewProductsComponent}, 
  {path: 'add-product', component: AddProductComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
