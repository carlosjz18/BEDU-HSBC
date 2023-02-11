import {AfterViewInit, Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-contenedor-formulario',
  templateUrl: './contenedor-formulario.component.html',
  styleUrls: ['./contenedor-formulario.component.css']
})
export class ContenedorFormularioComponent implements OnInit, AfterViewInit {

  constructor() {
    console.log("--Constructor---");
  }

  ngOnInit(): void {
    console.log("--ngOnInit---");
  }

  ngAfterViewInit(): void {
    console.log("--ngAfterViewInit---");
  }

}
