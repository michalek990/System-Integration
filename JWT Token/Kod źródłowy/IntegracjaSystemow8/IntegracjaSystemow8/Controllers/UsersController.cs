using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Configuration;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using IntegracjaSystemow8.Model;
using IntegracjaSystemow8.Sevices.Users;
using System.Net;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Authentication.JwtBearer;

namespace IntegracjaSystemow8.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
     public class UsersController : ControllerBase
    {
        private IUserService userService;
        public UsersController(IUserService userService)
        {
            this.userService = userService;
        }
        
        [HttpPost("authenticate")]
        public IActionResult
    Authenticate(AuthenticationRequest request)
        {
            var response = userService.Authenticate(request);
            if (response == null)
                return BadRequest(new
                {
                    message = "Username or password is incorrect" });
        return Ok(response);
        }
        [Authorize(AuthenticationSchemes = JwtBearerDefaults.AuthenticationScheme)]
        [HttpGet("allusers")]
        public IActionResult GetUsers()
        {
            var users = userService.GetUsers();
            return Ok(users);
        }
    }

}
