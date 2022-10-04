<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <HelloWorld msg="Welcome to Your Vue.js App"/>
  <TailwindDatepicker/>
  <ProductTwo/>
  <a>"asfdfsdf"</a>  
  <table>
<caption>Перечень продуктов</caption>
  <tr>
    <th>№ п/п</th>
    <th>Наименование товара</th>
    <th>Ед. изм.</th>
    <th>Количество</th>
    <th>Цена за ед. изм., руб.</th>
    <th>Стоимость, руб.</th>
  </tr>
  <tr>
    <td>1.</td>
    <td>Томаты свежие</td><td>кг</td><td>15,20</td><td>69,00</td><td>1048,80</td>
  </tr>
  <tr>
    <td>2.</td>
    <td>Огурцы свежие</td><td>кг</td><td>2,50</td><td>48,00</td><td>120,00</td>
  </tr>
  <tr>
    <td colspan="5" style="text-align:right">ИТОГО:</td><td>1168,80</td>
  </tr>
</table>
<table>
  <colgroup>
    <col span="2" style="background:Khaki"><!-- С помощью этой конструкции задаем цвет фона для первых двух столбцов таблицы-->
    <col style="background-color:LightCyan"><!-- Задаем цвет фона для следующего (одного) столбца таблицы-->
  </colgroup>
  <tr>
    <th>№ п/п</th>
    <th>Наименование</th>
    <th>Цена, руб.</th>
  </tr>
  <tr>
    <td>1</td>
    <td>Карандаш цветной</td>
    <td>20,00</td>
  </tr>
  <tr>
    <td>2</td>
    <td>Линейка 20 см</td>
    <td>30,00</td>
  </tr>
</table>
<table>
 <thead>
  <tr>
    <th>№ п/п</th>
    <th>Наименование товара</th>
     <th>Ед. изм.</th>
     <th>Количество</th>
     <th>Цена за ед. изм., руб.</th>
     <th>Стоимость, руб.</th>
  </tr>
 </thead>
<tfoot>
  <tr>
    <td colspan="5" style="text-align:right">ИТОГО:</td><td>1168,80</td>
  </tr>
</tfoot>
<tbody>
  <tr>
    <td>1.</td>
    <td>Томаты свежие</td><td>кг</td><td>15,20</td><td>69,00</td><td>1048,80</td>
  </tr>
  <tr>
    <td>2.</td>
    <td>Огурцы свежие</td><td>кг</td><td>2,50</td><td>48,00</td><td>120,00</td>
  </tr>
</tbody>  
</table>
<table>
  <tr>
    <th>№ п/п</th>
    <th>Наименование товара</th>
     <th>Ед. изм.</th>
     <th>Количество</th>
     <th>Цена за ед. изм., руб.</th>
     <th>Стоимость, руб.</th>
  </tr>
  <tr>
    <td>1.</td>
    <td>Томаты свежие</td><td>кг</td><td>15,20</td><td>69,00</td><td>1048,80</td>
  </tr>
  <tr>
    <td>2.</td>
    <td>Огурцы свежие</td><td>кг</td><td>2,50</td><td>48,00</td><td>120,00</td>
  </tr>
  <tr>
    <td colspan="5" style="text-align:right">ИТОГО:</td><td>1168,80</td><!-- Задаем количество ячеек по горизонтали для объединения-->
  </tr>
</table>
<table>
  <caption>Меню ресторана "Ромашка"</caption> 
  <tr>
    <th rowspan="2" class="first">Кухня</th>
    <th colspan="2">Холодные блюда</th>
    <th colspan="2">Горячие блюда</th>
    <th rowspan="2">Десерты</th>
  </tr>
  <tr>
    <td class="first">Салаты</td>
    <td class="first">Закуски</td>
    <td class="first">Первые блюда</td>
    <td class="first">Вторые блюда</td>
  </tr>
  <tr>
    <td rowspan="3" class="first">Русская</td>
    <td>Винегрет</td>
    <td>Язык с хреном</td>
    <td>Щи с квашеной капустой</td>
    <td>Вареники с картошкой</td>
    <td>Печеные яблоки с медом</td>
  </tr>
  <tr>
    <td>Оливье</td>
    <td>Студень говяжий</td>
    <td>Рассольник домашний</td>
    <td>Караси запеченые в сметане</td>
    <td>Блинчатый пирог</td>
  </tr>
  <tr>
    <td>Сельдь под "шубой"</td>
    <td>Судак заливной</td>
    <td>Мясная солянка</td>
    <td>Котлеты "Пожарские"</td>
    <td>Пирожное "Картошка"</td>
    </tr>
  <tr>
    <td rowspan="3" class="first">Испанская</td>
    <td>Севиче из гребешков</td>
    <td>Эмпанадас</td>
    <td>Хлебный суп с чесноком</td>
    <td>Паэлья с морепродуктами</td>
    <td>Чуррос</td>
    </tr>
  <tr>
    <td>Тимбал из авокадо и тунца</td>
    <td>Ахотомате</td>
    <td>Астурийская фабада</td>
    <td>Свиное раксо</td>
    <td>Альмойшавена</td>
    </tr>
  <tr>
    <td>Фасоль с ветчиной</td>
    <td>Чанфайна</td>
    <td>Рыбный суп с манными клецками </td>
    <td>Тортилья картофельная</td>
    <td>Бунуэлос</td>
    </tr>
  <tr>
    <td rowspan="3" class="first">Французская</td>
    <td>Вогезский салат</td>
    <td>Рийет из курицы</td>
    <td>Баклажанный крем-суп "Ренуар"</td>
    <td>Картофель огратен</td>
    <td>Бриоши</td>
    </tr>
  <tr>
    <td>Салат "Панзанелла"</td>
    <td>Делисьез из сыра</td>
    <td>Французский тыквенный суп</td>
    <td>Гратин из птицы</td>
    <td>Лигурийский лимонный пирог</td>
    </tr>
  <tr>
    <td>Тар-тар</td>
    <td>Маринованный лосось</td>
    <td>Суп "Конти"</td>
    <td>Тартифлетт</td>
    <td>Саварен "Триумф"</td>
    </tr>
  </table>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import TailwindDatepicker from './components/TailwindDatepicker.vue';
import ProductTwo from './components/ProductTwo.vue';

export default {
  name: 'App',
  components: {
    HelloWorld,
    TailwindDatepicker,
    ProductTwo
}
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;  
}
body {
  margin: 0;
  background: #F4F1F8;
}
table {
  border-collapse: collapse; 
  line-height: 1.1;
  font-family: "Lucida Sans Unicode", "Lucida Grande", sans-serif;
  background:  radial-gradient(farthest-corner at 50% 50%, white, #DCECF8);
  color: #0C213B;
}
caption {
  font-family: annabelle, cursive;
  font-weight: bold;
  font-size: 2em;
  padding: 10px; 
  color: #F3CD26;
  text-shadow: 1px 1px 0 rgba(0,0,0,.3);
 }
caption:before, caption:after {
  content: "\274B";
  color: #A9E2CC;
  margin: 0 10px;
}
th {
  padding: 10px; 
  border: 1px solid #A9E2CC;
}
td {
  font-size: 0.8em;
  padding: 5px 7px;
  border: 1px solid #A9E2CC;
}
.first {
  font-size: 1em;
  font-weight: bold;
  text-align: center;
}
</style>
