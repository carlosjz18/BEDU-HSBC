import {Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'proyecto_01';

  constructor() {
    this.bienvenida();
    const imc = this.calcularIMC(70, 1.8);
    this.imprimirIMC(imc);
  }

  bienvenida() {
    console.log("bienvenido al curso!");
  }

  calcularIMC(peso: number, altura: number): number {
    return peso / (altura ^ 2);
  }

  imprimirIMC(imc: number) {
    console.log("tu IMC es: " + imc);
  }
}
