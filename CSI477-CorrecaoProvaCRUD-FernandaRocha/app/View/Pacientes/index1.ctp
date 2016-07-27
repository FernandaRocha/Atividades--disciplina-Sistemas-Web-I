<div class="container text-center">
  <h3><strong>Página do Cliente<br></strong></h3>
  <div class="row">
    <div class="col-sm-12">
      <img src="./img/pac.jpg">

    </div>
  </div>
</div>

<br></br>

<?php echo $this->Html->link("Cadastrar como novo usuário!",
array('controller' => 'pacientes',
'action' => 'addp'));?> <br></br>

<?php echo $this->Html->link("Fazer Login",
array('controller' => 'pacientes',
'action' => 'login'));?> <br></br>
