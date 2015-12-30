<html>
<head>
<title>EL and Complex JavaBeans</title>
<style>body, td {font-family:verdana;font-size:10pt;}</style>
</head>
<body>
  <h2>Display Users</h2>
  <table border="1">
  <tr>
  <td>${person.name}</td>
  <td>${person.age}</td>
  <td>${person["address"].line1}</td>
  <td>${person["address"].town}</td>
  <td>${person.address.phoneNumbers[0].std}
  ${person.address.phoneNumbers[0].number}</td>
  <td>${person.address.phoneNumbers[1].std}
  ${person.address.phoneNumbers[1].number}</td>
  </tr>
  </table>
</body>
</html>