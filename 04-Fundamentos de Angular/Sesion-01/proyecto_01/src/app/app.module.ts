import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ContenedorFormularioComponent } from './componentes/contenedor-formulario/contenedor-formulario.component';
import { InputStringComponent } from './componentes/input-string/input-string.component';
import { HeaderComponent } from './estructura-web/header/header.component';
import { BodyComponent } from './estructura-web/body/body.component';
import { FooterComponent } from './estructura-web/footer/footer.component';
import { TituloComponent } from './nota/titulo/titulo.component';
import { AutorComponent } from './nota/autor/autor.component';
import { ContenedorNotaComponent } from './nota/contenedor-nota/contenedor-nota.component';
import { IntroduccionComponent } from './nota/cuerpo/introduccion/introduccion.component';
import { ImagenesComponent } from './nota/cuerpo/imagenes/imagenes.component';
import { ConclusionesComponent } from './nota/cuerpo/conclusiones/conclusiones.component';
import { OtroComponent } from './componentes/otro/otro.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    ContenedorFormularioComponent,
    InputStringComponent,
    HeaderComponent,
    BodyComponent,
    FooterComponent,
    TituloComponent,
    AutorComponent,
    ContenedorNotaComponent,
    IntroduccionComponent,
    ImagenesComponent,
    ConclusionesComponent,
    OtroComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
