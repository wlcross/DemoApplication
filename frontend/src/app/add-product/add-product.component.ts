import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from "@angular/forms";


@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.scss']
})
export class AddProductComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  submitProduct(form:FormGroup) {

    console.log(form.value);
    alert("Form Success");
    form.reset();
  }

}
