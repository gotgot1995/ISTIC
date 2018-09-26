import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filterPokemon'
})
export class FilterPokemonPipe implements PipeTransform {

  transform(value: any, args?: any): any {
    return null;
  }

}
